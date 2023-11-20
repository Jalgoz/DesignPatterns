package components;

import mediator.Mediator;
import mediator.Note;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
  private Mediator mediator;
  private ListModel listModel;

  public Filter() {
  }

  public void setList(ListModel listModel) {
    this.listModel = listModel;
  }

  /**
   * Search a String param in listModel and return all the occurrences
   *
   * @param param to search
   */
  private void searchElements(String param) {
    if (listModel == null) {
      return;
    }

    if (param.equals("")) {
      mediator.setElementsList(listModel);
      return;
    }

    ArrayList<Note> notes = new ArrayList<>();
    for (int i = 0; i < listModel.getSize(); i++) {
      notes.add((Note) listModel.getElementAt(i));
    }

    DefaultListModel<Note> defaultListModel = new DefaultListModel<>();
    for (Note note: notes) {
      if (note.getName().contains(param)) {
        defaultListModel.addElement(note);
      }
    }

    mediator.setElementsList(defaultListModel);
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public String getName() {
    return "Filter";
  }

  @Override
  protected void processComponentKeyEvent(KeyEvent e) {
    String start = super.getText();
    searchElements(start);
  }
}
