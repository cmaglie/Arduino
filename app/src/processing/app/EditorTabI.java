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

import java.io.IOException;

import javax.swing.JMenuItem;
import javax.swing.JPanel;

import processing.app.syntax.PdeKeywords;
import processing.app.syntax.SketchTextArea;

public abstract class EditorTabI extends JPanel {

  protected SketchFile file;

  public EditorTabI(Editor parentEditor, SketchFile sketchFile)
      throws IOException {
    file = sketchFile;
  }
  
  /**
   * Get the SketchFile that is being edited/viewed in this tab.
   */
  public SketchFile getSketchFile() {
    return this.file;
  }

  /**
   * Adds the "Edit" menu entries for the current editor tab.
   * 
   * @param menu
   *          The JMenu object where the commands are added
   */
  abstract public JMenuItem[] getEditMenuEntries();
  
  abstract public void updateKeywords(PdeKeywords keywords);
  
  abstract public void applyPreferences();
  
  abstract public SketchTextArea getTextArea();

  abstract void handleIndentOutdent(boolean indent);
  abstract void handleCommentUncomment();

  abstract public void activated();
  abstract public void reload();
  
  abstract public String getText();
  abstract public void setText(String what);
  abstract public String getCurrentKeyword();
  abstract public String getLineText(int line);
  
  abstract public void setSelection(int start, int stop);
  abstract public String getSelectedText();
  abstract public int getSelectionStart();
  abstract public int getSelectionStop();
  abstract public void setSelectedText(String what);
  
  abstract public void goToLine(int line);
}
