package commands;

import editor.Editor;

public abstract class Command {
  public Editor editor;
  private String backup;

  public Command(Editor editor) {
    this.editor = editor;
  }

  public void backup() {
    this.backup = editor.textField.getText();
  }

  public void undo() {
    this.editor.textField.setText(backup);
  }

  public abstract boolean execute();
}
