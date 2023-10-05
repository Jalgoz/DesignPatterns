package ConcreteProducts.MacOS;

import AbstractProducts.Checkbox;

public class MacOSCheckbox implements Checkbox {
  @Override
  public void paint() {
    System.out.println("You have created a MacOSCheckbox.");
  }
}
