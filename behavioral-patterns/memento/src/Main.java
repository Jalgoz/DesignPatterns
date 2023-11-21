import editor.TextEditor;
import history.HistoryCaretaker;

public class Main {
  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor();
    HistoryCaretaker caretaker = new HistoryCaretaker();

    // Write and save texts
    textEditor.setContent("First line");
    caretaker.saveMemento(textEditor.save());

    textEditor.setContent("Second line");
    caretaker.saveMemento(textEditor.save());

    textEditor.setContent("Third line");
    caretaker.saveMemento(textEditor.save());

    // Undo
    textEditor.restore(caretaker.getMemento(1));
    System.out.println("Content after undo: " + textEditor.getContent());

    // Redo
    textEditor.restore(caretaker.getMemento(2));
    System.out.println("Content after redo: " + textEditor.getContent());
  }
}