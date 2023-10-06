import AbstractFactory.GUIFactory;
import AbstractProducts.Button;
import AbstractProducts.Checkbox;

/**
 * This class works as an interface to create products within the same family
 * this class has to create the products even if it doesn't know which family is
 */
public class InterfaceCreation {
  private Button button;
  private Checkbox checkbox;

  public InterfaceCreation(GUIFactory factory) {
    this.button = factory.createButton();
    this.checkbox = factory.createCheckbox();
  }

  public void paint() {
    button.paint();
    checkbox.paint();
  }

  public void click(int numberClicks) {
    button.click(numberClicks);
  }

  public Button getButton() {
    return button;
  }

  public Checkbox getCheckbox() {
    return checkbox;
  }
}
