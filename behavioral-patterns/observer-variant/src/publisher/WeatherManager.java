package publisher;

import observers.Observer;
import weather.Weather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class notify to the observer the changes in the weather
 */
public class WeatherManager implements Publisher {
  private final List<Observer> observers = new ArrayList<>();

  @Override
  public void addObserver(Observer... observers) {
    this.observers.addAll(Arrays.asList(observers));
  }

  @Override
  public void removeObserver(Observer... observers) {
    this.observers.removeAll(Arrays.asList(observers));
  }

  @Override
  public void notifyObservers(Weather weather) {
    observers.forEach(observer -> {
      observer.update(weather);
    });
  }
}
