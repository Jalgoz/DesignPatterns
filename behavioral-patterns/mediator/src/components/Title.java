package components;

import mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
public class Title extends JTextField implements Component {
  private Mediator mediator;

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public String getName() {
    return "Title";
  }

  @Override
  protected void processComponentKeyEvent(KeyEvent keyEvent) {
    mediator.markNote();
  }
}
