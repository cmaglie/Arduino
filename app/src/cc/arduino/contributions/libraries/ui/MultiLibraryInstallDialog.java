package cc.arduino.contributions.libraries.ui;

import static processing.app.I18n.tr;
import static processing.app.Theme.scale;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import cc.arduino.utils.Progress;
import processing.app.Base;

public class MultiLibraryInstallDialog extends JDialog {

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      JFrame frame = new JFrame();
      MultiLibraryInstallDialog ex = new MultiLibraryInstallDialog(frame,
          "hellO");
      ex.setVisible(true);
      frame.setVisible(true);
    });
  }

  public MultiLibraryInstallDialog(Window parent, String title) {
    super(parent, title, ModalityType.APPLICATION_MODAL);

    setResizable(true);

    Container pane = getContentPane();
    pane.setLayout(new BorderLayout());

    {
      JPanel librarylistContainer = new JPanel();
      librarylistContainer
          .setLayout(new BoxLayout(librarylistContainer, BoxLayout.X_AXIS));
      librarylistContainer.add(new JLabel(tr("blah")));
      librarylistContainer.setBorder(new EmptyBorder(7, 7, 7, 7));
      pane.add(librarylistContainer, BorderLayout.NORTH);
    }

    pane.add(Box.createHorizontalStrut(10), BorderLayout.WEST);
    pane.add(Box.createHorizontalStrut(10), BorderLayout.EAST);

    // progressBar = new ProgressJProgressBar();
    // progressBar.setStringPainted(true);
    // progressBar.setString(" ");
    // progressBar.setVisible(true);
    //
    // errorMessage = new JLabel("");
    // errorMessage.setForeground(Color.RED);

    {
      JButton cancelButton = new JButton(tr("Cancel"));
      // cancelButton.addActionListener(arg0 -> onCancelPressed());

      JButton okButton = new JButton(tr("OK"));
      // okButton.addActionListener(arg0 -> {
      // clearErrorMessage();
      // setErrorMessageVisible(false);
      // });

      Box progressBox = Box.createHorizontalBox();
      progressBox.add(okButton);
      progressBox.add(Box.createHorizontalStrut(5));
      progressBox.add(cancelButton);

      // JButton closeButton = new JButton(tr("Close"));
      // closeButton.addActionListener(arg0 ->
      // InstallerJDialog.this.dispatchEvent(new
      // WindowEvent(InstallerJDialog.this, WindowEvent.WINDOW_CLOSING)));

      JPanel progressPanel = new JPanel();
      progressPanel.setBorder(new EmptyBorder(7, 10, 7, 10));
      progressPanel.setLayout(new BoxLayout(progressPanel, BoxLayout.Y_AXIS));
      progressPanel.add(progressBox);
      pane.add(progressPanel, BorderLayout.SOUTH);
    }

    //setMinimumSize(scale(new Dimension(800, 450)));
    setMinimumSize(new Dimension(800, 450));

    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    Base.registerWindowCloseKeys(getRootPane(),
                                 e -> MultiLibraryInstallDialog.this
                                     .dispatchEvent(new WindowEvent(
                                         MultiLibraryInstallDialog.this,
                                         WindowEvent.WINDOW_CLOSING)));
  }

  public boolean getInstallDepsResult() {
    return false;
  }

  public void setProgress(Progress progress) {
    // progressBar.setValue(progress);
  }
}
