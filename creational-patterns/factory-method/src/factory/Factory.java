package factory;

import abstractProduct.Transport;

public abstract class Factory {
  public void delivery() {
    Transport transport = createTransport();
    transport.refuel();
    transport.delivery();
  }

  public abstract Transport createTransport();
}
