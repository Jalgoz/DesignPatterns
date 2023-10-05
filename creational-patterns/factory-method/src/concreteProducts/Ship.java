package concreteProducts;

import abstractProduct.Transport;

public class Ship extends Transport {
  @Override
  public void delivery() {
    if (super.getModel() == null) {
      System.out.println("Pick up to the ship harbor, and delivering ........");
    } else {
      System.out.printf("%s has picked up the package, and it is going to delivery it%n", super.getModel());
    }
  }

  @Override
  public void refuel() {
    if (!Double.isNaN(super.getFuel())) {
      System.out.println("Refueling in the tanker truck");
      super.setFuel(100);
    };
  }
}
