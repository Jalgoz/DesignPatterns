package factory;

import abstractProduct.Transport;
import concreteProducts.Truck;

public class TruckFactory extends Factory {
  @Override
  public Transport createTransport() {
    return new Truck();
  }
}
