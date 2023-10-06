import builders.CarBuilder;
import cars.Car;
import cars.CarType;
import components.*;

public class Main {
  public static void main(String[] args) {
    CarBuilder builder = new CarBuilder();
    Car cityCar = builder.setCarType(CarType.CITY_CAR)
        .setSeats(4)
        .setTiresType(TiresType.PASSENGER_TIRES)
        .setEngine(new Engine(3.0, 0.0))
        .setTransmission(TransmissionType.MANUAL)
        .setTripComputer(new TripComputer())
        .setGPSNavigator(new GPSNavigator())
        .build();
    System.out.println(cityCar);
    cityCar.setFuel(5);
    cityCar.getTripComputer().setCar(cityCar);
    cityCar.getTripComputer().showFuelLevel();
    cityCar.getTripComputer().showStatus();
    cityCar.getEngine().on();
    cityCar.getTripComputer().showStatus();

    builder = new CarBuilder();
    Car uncompletedCar = builder.setCarType(CarType.SPORT_CAR).build();
    System.out.println(uncompletedCar);
  }
}