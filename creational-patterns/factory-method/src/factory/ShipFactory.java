package factory;

import abstractProduct.Transport;
import concreteProducts.Ship;

public class ShipFactory extends Factory {
  @Override
  public Transport createTransport() {
    return new Ship();
  }
}
