package editor;

import publisher.EventManager;

import java.io.File;

public class Editor {
  public EventManager events;
  private File file;

  public Editor() {
    this.events = new EventManager("open", "save");
  }

  public void openFile(String filePath) {
    this.file = new File(filePath);
    this.events.notify("open", this.file);
  }

  public void saveFile() throws Exception {
    if (this.file != null) {
      this.events.notify("save", file);
    } else {
      throw new Exception("Please open a file first.");
    }
  }
}
