/*
 * This file is part of Arduino.
 *
 * Copyright 2014 Arduino LLC (http://www.arduino.cc/)
 *
 * Arduino is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * As a special exception, you may use this file as part of a free software
 * library without restriction.  Specifically, if other files instantiate
 * templates or use macros or inline functions from this file, or you compile
 * this file and link it with other files to produce an executable, this
 * file does not by itself cause the resulting executable to be covered by
 * the GNU General Public License.  This exception does not however
 * invalidate any other reasons why the executable file might be covered by
 * the GNU General Public License.
 */

package cc.arduino.contributions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zafarkhaja.semver.Version;

import java.io.File;

public abstract class DownloadableContribution {

  @JsonProperty("url")
  private String url;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @JsonProperty("version")
  private String version;

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @JsonProperty("checksum")
  private String checksum;

  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  @JsonProperty("size")
  private long size;

  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }

  @JsonProperty("archiveFileName")
  private String archiveFileName;

  public String getArchiveFileName() {
    return archiveFileName;
  }

  public void setArchiveFileName(String archiveFileName) {
    this.archiveFileName = archiveFileName;
  }

  private boolean downloaded;

  public boolean isDownloaded() {
    return downloaded;
  }

  public void setDownloaded(boolean downloaded) {
    this.downloaded = downloaded;
  }

  private File downloadedFile;

  public File getDownloadedFile() {
    return downloadedFile;
  }

  public void setDownloadedFile(File downloadedFile) {
    this.downloadedFile = downloadedFile;
  }

  private boolean installed;

  public boolean isInstalled() {
    return installed;
  }

  public void setInstalled(boolean installed) {
    this.installed = installed;
  }

  private File installedFolder;

  public File getInstalledFolder() {
    return installedFolder;
  }

  public void setInstalledFolder(File installedFolder) {
    this.installedFolder = installedFolder;
  }

  private boolean readOnly;

  public boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(boolean readOnly) {
    this.readOnly = readOnly;
  }

  public String getParsedVersion() {
    Version ver = VersionHelper.valueOf(getVersion());
    if (ver == null) {
      return null;
    }
    return ver.toString();
  }

  @Override
  public String toString() {
    String res = "";
    if (installed) {
      res += "installed on " + installedFolder.getAbsolutePath() + " ("
             + getSize() + " bytes)";
    }
    return res;
  }
}
