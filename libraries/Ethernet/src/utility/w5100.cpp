/*
 * Copyright (c) 2010 by Cristian Maglie <c.maglie@bug.st>
 *
 * This file is free software; you can redistribute it and/or modify
 * it under the terms of either the GNU General Public License version 2
 * or the GNU Lesser General Public License version 2.1, both as
 * published by the Free Software Foundation.
 */

#include <stdio.h>
#include <string.h>

#include "utility/w5100.h"

// W5100 controller instance
W5100Class W5100;

uint8_t W5100Class::chipset = 0;
uint8_t W5100Class::sockets = 4;

#define TX_RX_MAX_BUF_SIZE 2048
#define TX_BUF 0x1100
#define RX_BUF (TX_BUF + TX_RX_MAX_BUF_SIZE)

#define TXBUF_BASE 0x4000
#define RXBUF_BASE 0x6000

void W5100Class::init(void)
{
  delay(300);

#if !defined(SPI_HAS_EXTENDED_CS_PIN_HANDLING)
  SPI.begin();
  initSS();
#else
  SPI.begin(SPI_CS);
  // Set clock to 4Mhz (W5100 should support up to about 14Mhz)
  SPI.setClockDivider(SPI_CS, 21);
  SPI.setDataMode(SPI_CS, SPI_MODE0);
#endif

  /*
   * Runtime detection of Wiznet Chip.
   * Based on code from: https://github.com/jbkim/Differentiate-WIznet-Chip
   */
  uint8_t testW5200[] = { 0x00, 0x1F, 0x00, 0x01, 0x00 };
  uint8_t testW5500[] = { 0x00, 0x39, 0x00, 0x00 };
  SPI.beginTransaction(SPI_ETHERNET_SETTINGS);
#if !defined(SPI_HAS_EXTENDED_CS_PIN_HANDLING)
  // Check for W5200
  setSS();
  SPI.transfer(testW5200, 5);
  resetSS();
  if (testW5200[4] == 0x03) {
    chipset = 2;
  } else {
    // Check for W5500
    setSS();
    SPI.transfer(testW5500, 4);
    resetSS();
    if (testW5500[3] == 0x04) {
      chipset = 5;
    } else {
      chipset = 1;
    }
  }
#else
  // Check for W5200
  SPI.transfer(SPI_CS, testW5200, 5);
  if (testW5200[4] == 0x03) {
    chipset = 2;
  } else {
    // Check for W5500
    SPI.transfer(SPI_CS, testW5500, 4);
    if (testW5500[3] == 0x04) {
      chipset = 5;
    } else {
      chipset = 1;
    }
  }
#endif
  SPI.endTransaction();

  // W5x00 reset
  if (chipset == 1) {
    sockets = 4;
    SPI.beginTransaction(SPI_ETHERNET_SETTINGS);
    writeMR(1<<RST);
    writeTMSR(0x55);
    writeRMSR(0x55);
    SPI.endTransaction();

    for (int i=0; i<sockets; i++) {
      SBASE[i] = TXBUF_BASE + SSIZE * i;
      RBASE[i] = RXBUF_BASE + RSIZE * i;
    }
  } else if (chipset == 2) {
    // XXX: TODO
  } else {
    sockets = 8;
    writeMR(1<<RST);
    for (uint8_t i=0; i<sockets; i++) {
      writeSnRXBUF_SIZE(i, 2);
      writeSnTXBUF_SIZE(i, 2);
    }
  }
}

uint16_t W5100Class::getTXFreeSize(SOCKET s)
{
  uint16_t val=0, val1=0;
  do {
    val1 = readSnTX_FSR(s);
    if (val1 != 0)
      val = readSnTX_FSR(s);
  }
  while (val != val1);
  return val;
}

uint16_t W5100Class::getRXReceivedSize(SOCKET s)
{
  uint16_t val=0,val1=0;
  do {
    val1 = readSnRX_RSR(s);
    if (val1 != 0)
      val = readSnRX_RSR(s);
  }
  while (val != val1);
  return val;
}


void W5100Class::send_data_processing(SOCKET s, const uint8_t *data, uint16_t len)
{
  // This is same as having no offset in a call to send_data_processing_offset
  send_data_processing_offset(s, 0, data, len);
}

void W5100Class::send_data_processing_offset(SOCKET s, uint16_t data_offset, const uint8_t *data, uint16_t len)
{
  uint16_t ptr = readSnTX_WR(s);
  ptr += data_offset;

  if (chipset == 1) {
    uint16_t offset = ptr & SMASK;
    uint16_t dstAddr = offset + SBASE[s];
    if (offset + len > SSIZE)
    {
      // Wrap around circular buffer
      uint16_t size = SSIZE - offset;
      write(dstAddr, 0x00, data, size);
      write(SBASE[s], 0x00, data + size, len - size);
    } else {
      write(dstAddr, 0x00, data, len);
    }
  } else if (chipset == 2) {
    // XXX: TODO
  } else {
    write(ptr, (s<<5) + 0x14, data, len);
  }

  ptr += len;
  writeSnTX_WR(s, ptr);
}


void W5100Class::recv_data_processing(SOCKET s, uint8_t *data, uint16_t len, uint8_t peek)
{
  uint16_t ptr = readSnRX_RD(s);
  read_data(s, ptr, data, len);
  if (!peek)
  {
    ptr += len;
    writeSnRX_RD(s, ptr);
  }
}

void W5100Class::read_data(SOCKET s, volatile uint16_t src, volatile uint8_t *dst, uint16_t len)
{
  if (chipset == 1) {
    uint16_t src_mask = src & RMASK;
    uint16_t src_ptr = RBASE[s] + src_mask;
    if ((src_mask + len) > RSIZE) {
      uint16_t size = RSIZE - src_mask;
      read(src_ptr, 0x00, (uint8_t *)dst, size);
      dst += size;
      read(RBASE[s], 0x00, (uint8_t *) dst, len - size);
    } else {
      read(src_ptr, 0x00, (uint8_t *) dst, len);
    }
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    read((uint16_t)src , (s<<5) + 0x18, (uint8_t *)dst, len);
  }
}


uint8_t W5100Class::write(uint16_t _addr, uint8_t _cb, uint8_t _data)
{
#if !defined(SPI_HAS_EXTENDED_CS_PIN_HANDLING)
  setSS();
  if (chipset == 1) {
    SPI.transfer(0xF0);
    SPI.transfer(_addr >> 8);
    SPI.transfer(_addr & 0xFF);
    SPI.transfer(_data);
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    SPI.transfer(_addr >> 8);
    SPI.transfer(_addr & 0xFF);
    SPI.transfer(_cb);
    SPI.transfer(_data);
  }
  resetSS();
#else
  if (chipset == 1) {
    SPI.transfer(SPI_CS, 0xF0, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _data);
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _cb, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _data);
  }
#endif
  return 1;
}

uint16_t W5100Class::write(uint16_t _addr, uint8_t _cb, const uint8_t *_buf, uint16_t _len)
{
#if !defined(SPI_HAS_EXTENDED_CS_PIN_HANDLING)
  if (chipset == 1) {
    for (uint16_t i=0; i<_len; i++)
    {
      setSS();
      SPI.transfer(0xF0);
      SPI.transfer(_addr >> 8);
      SPI.transfer(_addr & 0xFF);
       _addr++;
      SPI.transfer(_buf[i]);
      resetSS();
    }
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    setSS();
    SPI.transfer(_addr >> 8);
    SPI.transfer(_addr & 0xFF);
    SPI.transfer(_cb);
    for (uint16_t i=0; i<_len; i++){
      SPI.transfer(_buf[i]);
    }
    resetSS();
  }
#else
  if (chipset == 1) {
    for (uint16_t i=0; i<_len; i++)
    {
      SPI.transfer(SPI_CS, 0xF0, SPI_CONTINUE);
      SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
      SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
      SPI.transfer(SPI_CS, _buf[i]);
      _addr++;
    }
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    uint16_t i;
    SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _cb, SPI_CONTINUE);
    for (i=0; i<_len-1; i++){
      SPI.transfer(SPI_CS, _buf[i], SPI_CONTINUE);
    }
    SPI.transfer(SPI_CS, _buf[i]);
  }
#endif
  return _len;
}

uint8_t W5100Class::read(uint16_t _addr, uint8_t _cb)
{
  uint8_t res;
#if !defined(SPI_HAS_EXTENDED_CS_PIN_HANDLING)
  setSS();
  if (chipset == 1) {
    SPI.transfer(0x0F);
    SPI.transfer(_addr >> 8);
    SPI.transfer(_addr & 0xFF);
    res = SPI.transfer(0);
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    SPI.transfer(_addr >> 8);
    SPI.transfer(_addr & 0xFF);
    SPI.transfer(_cb);
    res = SPI.transfer(0);
  }
  resetSS();
#else
  if (chipset == 1) {
    SPI.transfer(SPI_CS, 0x0F, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
    res = SPI.transfer(SPI_CS, 0);
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _cb, SPI_CONTINUE);
    uint8_t _data = SPI.transfer(SPI_CS, 0);
  }
#endif
  return res;
}

uint16_t W5100Class::read(uint16_t _addr, uint8_t _cb, uint8_t *_buf, uint16_t _len)
{
#if !defined(SPI_HAS_EXTENDED_CS_PIN_HANDLING)
  if (chipset == 1) {
    for (uint16_t i=0; i<_len; i++)
    {
      setSS();
      SPI.transfer(0x0F);
      SPI.transfer(_addr >> 8);
      SPI.transfer(_addr & 0xFF);
      _addr++;
      _buf[i] = SPI.transfer(0);
      resetSS();
    }
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    setSS();
    SPI.transfer(_addr >> 8);
    SPI.transfer(_addr & 0xFF);
    SPI.transfer(_cb);
    for (uint16_t i=0; i<_len; i++){
      _buf[i] = SPI.transfer(0);
    }
    resetSS();
  }
#else
  if (chipset == 1) {
    for (uint16_t i=0; i<_len; i++)
    {
      SPI.transfer(SPI_CS, 0x0F, SPI_CONTINUE);
      SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
      SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
      _buf[i] = SPI.transfer(SPI_CS, 0);
      _addr++;
    }
  } else if (chipset == 2) {
    // XXX: Missing 5200
  } else {
    uint16_t i;
    SPI.transfer(SPI_CS, _addr >> 8, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _addr & 0xFF, SPI_CONTINUE);
    SPI.transfer(SPI_CS, _cb, SPI_CONTINUE);
    for (i=0; i<_len-1; i++){
      _buf[i] = SPI.transfer(SPI_CS, 0, SPI_CONTINUE);
    }
    _buf[_len-1] = SPI.transfer(SPI_CS, 0);
  }
#endif

  return _len;
}

void W5100Class::execCmdSn(SOCKET s, SockCMD _cmd) {
  // Send command to socket
  writeSnCR(s, _cmd);
  // Wait for command to complete
  while (readSnCR(s))
    ;
}

