package factory;

import abstractProduct.Transport;
import concreteProducts.Plane;

public class PlaneFactory extends Factory {
  @Override
  public Transport createTransport() {
    return new Plane();
  }
}
