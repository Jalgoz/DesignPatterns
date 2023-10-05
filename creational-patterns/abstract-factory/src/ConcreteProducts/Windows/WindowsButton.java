package ConcreteProducts.Windows;

import AbstractProducts.Button;

public class WindowsButton implements Button {
  @Override
  public void paint() {
    System.out.println("You have created a WindowsButton.");
  }

  @Override
  public void click(int numberOfClicks) {
    System.out.println("You did " + numberOfClicks + " clicks");
  }
}
