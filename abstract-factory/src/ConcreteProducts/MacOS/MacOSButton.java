package ConcreteProducts.MacOS;

import AbstractProducts.Button;

public class MacOSButton implements Button {
  @Override
  public void paint() {
    System.out.println("You have created a MacOSButton.");
  }

  @Override
  public void click(int numberOfClicks) {
    System.out.println("You did " + numberOfClicks + " clicks");
  }
}
