package editor;

import history.EditorMemento;

public interface Memento {
  EditorMemento save();
  void restore(EditorMemento editorMemento);
}
