package observers;

import weather.Weather;

/**
 * This class represents an api for a trip application,
 * it can notify the weather to the users
 */
public class ApiAppTrip implements Observer {
  @Override
  public void update(Weather weather) {
    System.out.println("\nSending the info to the trip app: " + weather.toString());
  }
}
