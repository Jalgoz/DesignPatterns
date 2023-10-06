package cars;

import components.*;

public class Car {
  private CarType carType;
  private int seats;
  private TiresType tiresType;
  private Engine engine;
  private TransmissionType transmission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;
  private double fuel = 0;

  public Car() {
  }

  public Car(CarType carType, int seats, TiresType tiresType, Engine engine, TransmissionType transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
    this.carType = carType;
    this.seats = seats;
    this.tiresType = tiresType;
    this.engine = engine;
    this.transmission = transmission;
    this.tripComputer = tripComputer;
    this.gpsNavigator = gpsNavigator;
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public TiresType getTiresType() {
    return tiresType;
  }

  public void setTiresType(TiresType tiresType) {
    this.tiresType = tiresType;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public TransmissionType getTransmission() {
    return transmission;
  }

  public void setTransmission(TransmissionType transmission) {
    this.transmission = transmission;
  }

  public TripComputer getTripComputer() {
    return tripComputer;
  }

  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  public GPSNavigator getGpsNavigator() {
    return gpsNavigator;
  }

  public void setGpsNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public double getFuel() {
    return fuel;
  }

  public void setFuel(double fuel) {
    this.fuel = fuel;
  }

  @Override
  public String toString() {
    return "Car{" +
        "\ncarType=" + carType +
        "\nseats=" + seats +
        "\ntiresType=" + tiresType +
        "\nengine=" + engine +
        "\ntransmission=" + transmission +
        "\ngpsNavigator=" + gpsNavigator +
        "\nfuel=" + fuel +
        "\n}";
  }
}
