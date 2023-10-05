package ConcreteFactory;

import AbstractFactory.GUIFactory;
import AbstractProducts.Button;
import AbstractProducts.Checkbox;
import ConcreteProducts.MacOS.MacOSButton;
import ConcreteProducts.MacOS.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}
