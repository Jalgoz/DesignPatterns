package publisher;

import observers.Observer;
import weather.Weather;

public interface Publisher {
  void addObserver(Observer... observers);
  void removeObserver(Observer... observers);
  void notifyObservers(Weather weather);
}
