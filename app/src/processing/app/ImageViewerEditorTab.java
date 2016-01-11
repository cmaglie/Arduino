/*
 * This file is part of Arduino.
 *
 * Copyright 2015 Ricardo JL Rufino (ricardo@criativasoft.com.br)
 * Copyright 2015 Arduino LLC
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

package processing.app;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import processing.app.syntax.PdeKeywords;
import processing.app.syntax.SketchTextArea;

public class ImageViewerEditorTab extends EditorTabI {

  public ImageViewerEditorTab(Editor parentEditor, SketchFile sketchFile)
      throws IOException {
    super(parentEditor, sketchFile);
    setLayout(new BorderLayout());

    BufferedImage myPicture = ImageIO.read(file.getFile());
    JLabel picLabel = new JLabel(new ImageIcon(myPicture));

    JScrollPane scrollPane = new JScrollPane(picLabel);

    add(scrollPane, BorderLayout.CENTER);
  }

  @Override
  public Component[] getEditMenuEntries() {
    return new Component[0];
  }

  @Override
  public void updateKeywords(PdeKeywords keywords) {
  }

  @Override
  public void applyPreferences() {
  }

  @Override
  public SketchTextArea getTextArea() {
    return null;
  }

  @Override
  public void activated() {
  }

  @Override
  public void reload() {
  }

  @Override
  public String getText() {
    return "";
  }

  @Override
  public void setText(String what) {
  }

  @Override
  public String getCurrentKeyword() {
    return "";
  }

  @Override
  public String getLineText(int line) {
    return "";
  }

  @Override
  public void setSelection(int start, int stop) {
  }

  @Override
  public String getSelectedText() {
    return "";
  }

  @Override
  public int getSelectionStart() {
    return 0;
  }

  @Override
  public int getSelectionStop() {
    return 0;
  }

  @Override
  public void setSelectedText(String what) {
  }

  @Override
  public void goToLine(int line) {
  }

}
