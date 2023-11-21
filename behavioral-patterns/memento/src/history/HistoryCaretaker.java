package history;

import java.util.ArrayList;
import java.util.List;

public class HistoryCaretaker {
  private final List<EditorMemento> history = new ArrayList<>();

  public void saveMemento(EditorMemento memento) {
    history.add(memento);
  }

  public EditorMemento getMemento(int index) {
    return history.get(index);
  }
}
