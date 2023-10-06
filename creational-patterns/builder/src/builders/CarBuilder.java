package builders;

import cars.Car;
import cars.CarType;
import components.*;

public class CarBuilder implements Builder {
  private CarType carType;
  private int seats = 0;
  private TiresType tiresType;
  private Engine engine;
  private TransmissionType transmissionType;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  @Override
  public CarBuilder setCarType(CarType carType) {
    this.carType = carType;
    return this;
  }

  @Override
  public CarBuilder setSeats(int seats) {
    this.seats = seats;
    return this;
  }

  @Override
  public CarBuilder setTiresType(TiresType tiresType) {
    this.tiresType = tiresType;
    return this;
  }

  @Override
  public CarBuilder setEngine(Engine engine) {
    this.engine = engine;
    return this;
  }

  @Override
  public CarBuilder setTransmission(TransmissionType transmission) {
    this.transmissionType = transmission;
    return this;
  }

  @Override
  public CarBuilder setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
    return this;
  }

  @Override
  public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
    return this;
  }

  public Car build(){
    return new Car(carType, seats, tiresType, engine, transmissionType, tripComputer, gpsNavigator);
  }
}
