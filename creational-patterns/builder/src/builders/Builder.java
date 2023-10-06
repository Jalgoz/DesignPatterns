package builders;

import cars.CarType;
import components.*;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
  CarBuilder setCarType(CarType carType);
  CarBuilder setSeats(int seats);
  CarBuilder setTiresType(TiresType tiresType);
  CarBuilder setEngine(Engine engine);
  CarBuilder setTransmission(TransmissionType transmission);
  CarBuilder setTripComputer(TripComputer tripComputer);
  CarBuilder setGPSNavigator(GPSNavigator gpsNavigator);
}
