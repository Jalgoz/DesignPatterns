package abstractProduct;

public abstract class Transport {
  private String model;
  private double fuel;

  public Transport() {
  }

  public Transport(String model, double fuel) {
    this.model = model;
    this.fuel = fuel;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getFuel() {
    return fuel;
  }

  public void setFuel(double fuel) {
    this.fuel = fuel;
  }

  public abstract void delivery();
  public abstract void refuel();
}
