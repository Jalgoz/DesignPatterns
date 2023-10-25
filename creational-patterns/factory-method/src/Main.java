import abstractProduct.Transport;
import factory.Factory;
import factory.PlaneFactory;
import factory.ShipFactory;
import factory.TruckFactory;

public class Main {
  public static void main(String[] args) {
    Factory factory = new PlaneFactory();
    Transport plane = factory.createTransport();
    plane.setModel("F32");
    plane.refuel();
    plane.delivery();

    factory = new TruckFactory();
    factory.delivery();

    factory = new ShipFactory();
    factory.delivery();
  }
}