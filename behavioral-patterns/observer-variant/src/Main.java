import observers.ApiAppTrip;
import observers.StormAlertNotifier;
import observers.WeatherStation;
import publisher.WeatherManager;
import weather.Weather;

public class Main {
  public static void main(String[] args) {
    WeatherManager manager = new WeatherManager();
    manager.addObserver(new ApiAppTrip(),
        new StormAlertNotifier(),
        new WeatherStation());

    Weather weather = new Weather(manager);

    weather.setTemperature(50);
    weather.setWindSpeed(70);
  }
}