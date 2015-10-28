package cc.arduino.autocomplete;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.JTextComponent;

import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.Completion;
import org.fife.ui.autocomplete.DefaultCompletionProvider;

import processing.app.Sketch;
import processing.app.SketchCode;

public class InoCompletionProvider extends DefaultCompletionProvider {

  private Sketch sketch;

  public InoCompletionProvider(Sketch _sketch) {
    sketch = _sketch;
  }

  @Override
  public List<Completion> getCompletions(JTextComponent textArea) {
    SketchCode current = sketch.getCurrentCode();
    for (SketchCode code : sketch.getCodes()) {
      if (code == current)
        System.out.println(textArea.getText());
      else
        System.out.println(code.getProgram());
    }

    ArrayList<Completion> res = new ArrayList<Completion>();
    res.add(new BasicCompletion(this, "Hello"));
    return res;
  }
}
