package ConcreteFactory;

import AbstractFactory.GUIFactory;
import AbstractProducts.Button;
import AbstractProducts.Checkbox;
import ConcreteProducts.Windows.WindowsButton;
import ConcreteProducts.Windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
