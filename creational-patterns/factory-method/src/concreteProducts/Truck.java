package concreteProducts;

import abstractProduct.Transport;

public class Truck extends Transport {
  private int wheels;

  public Truck() {
  }

  public Truck(String model, double fuel, int wheels) {
    super(model, fuel);
    this.wheels = wheels;
  }

  @Override
  public void delivery() {
    if (super.getModel() == null) {
      System.out.println("Pick up to the warehouse, and delivering ........");
    } else {
      System.out.printf("%s has picked up the package, and it is going to delivery it%n", super.getModel());
    }
  }

  @Override
  public void refuel() {
    if (!Double.isNaN(super.getFuel())) {
      System.out.println("Refueling in the gas station");
      super.setFuel(100);
    };
  }
}
