package components;

import mediator.Mediator;
import mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Concrete components don't talk with each other. They have only one communication
 * channel-sending requests to the mediator.
 */
public class AddButton extends JButton implements Component {
  private Mediator mediator;

  public AddButton() {
    super("Add" );
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public String getName() {
    return "AddButton";
  }

  @Override
  protected void fireActionPerformed(ActionEvent event) {
    mediator.addNewNote(new Note());
  }
}
