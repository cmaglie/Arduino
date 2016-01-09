/*
 * This file is part of Arduino.
 *
 * Copyright 2015 Arduino LLC (http://www.arduino.cc/)
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

import org.fest.swing.fixture.JMenuItemFixture;
import org.junit.Test;
import processing.app.helpers.SketchTextAreaFixture;

import static org.junit.Assert.assertEquals;

public class ReplacingTextGeneratesTwoUndoActionsTest extends AbstractGUITest {

  @Test
  public void shouldUndoAndRedo() throws Exception {
    JMenuItemFixture undo = window.menuItem("menuEditUndo");
    JMenuItemFixture redo = window.menuItem("menuEditRedo");
    SketchTextAreaFixture textArea = window.textArea("editor");

    String initalText = textArea.getText();

    // At the beginning undo and redo are disabled
    undo.requireDisabled();
    redo.requireDisabled();

    // Replace text, this generates *two* actions:
    // - Remove initialText (textarea is empty)
    // - Add new "fake text"
    textArea.setText("fake text");

    // Now shoud be enabled only undo
    undo.requireEnabled();
    redo.requireDisabled();

    // Undo once (-> empty textarea, undo and redo enabled)
    undo.click();
    assertEquals("", textArea.getText());
    undo.requireEnabled();
    redo.requireEnabled();

    // Redo once (-> fake text, only redo enabled)
    redo.click();
    assertEquals("fake text", textArea.getText());
    undo.requireEnabled();
    redo.requireDisabled();

    // Undo once (-> empty textarea, undo and redo enabled)
    undo.click();
    assertEquals("", textArea.getText());
    undo.requireEnabled();
    redo.requireEnabled();

    // Undo once (-> initalText, only redo enabled)
    undo.click();
    assertEquals(initalText, textArea.getText());
    undo.requireDisabled();
    redo.requireEnabled();
  }
}
