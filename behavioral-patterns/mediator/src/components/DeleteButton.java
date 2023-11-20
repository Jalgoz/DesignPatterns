package components;

import mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Concrete components don't talk with each other. They have only one communication
 * channel-sending requests to the mediator.
 */
public class DeleteButton extends JButton implements Component {
  private Mediator mediator;

  public DeleteButton() {
    super("Del");
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public String getName() {
    return "DelButton";
  }

  @Override
  protected void fireActionPerformed(ActionEvent event) {
    mediator.deleteNote();
  }
}
