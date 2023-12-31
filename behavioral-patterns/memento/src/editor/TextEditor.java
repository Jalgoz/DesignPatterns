package editor;

import history.EditorMemento;

/**
 * Originator class
 */
public class TextEditor implements Memento {
  private String content;

  public void setContent(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  @Override
  public EditorMemento save() {
    return new EditorMemento(content);
  }

  @Override
  public void restore(EditorMemento memento) {
    this.content = memento.getContent();
  }
}
