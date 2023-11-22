package publisher;

import observers.Observer;
import weather.Weather;

/**
 * This interface defines the publisher methods
 */
public interface Publisher {
  void addObserver(Observer... observers);
  void removeObserver(Observer... observers);
  void notifyObservers(Weather weather);
}
