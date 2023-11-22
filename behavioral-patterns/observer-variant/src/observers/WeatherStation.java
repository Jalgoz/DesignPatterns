package observers;

import weather.Weather;

public class WeatherStation implements Observer {
  private WeatherState weatherState;
  private double currentTemperature;
  private double currentHumidity;
  private double currentWindSpeed;

  public WeatherStation() {
    this.weatherState = WeatherState.NORMAL;
  }

  @Override
  public void update(Weather weather) {
    this.currentTemperature = weather.getTemperature();
    this.currentHumidity = weather.getHumidity();
    this.currentWindSpeed = weather.getWindSpeed();

    if (this.currentTemperature > 40) {
      this.weatherState = WeatherState.HEAT_WAVE;
    } else if (this.currentTemperature < -5) {
      this.weatherState = WeatherState.SNOW;
    } else {
      this.weatherState = WeatherState.NORMAL;
    }

    if (this.currentHumidity > 20) {
      this.weatherState = WeatherState.RAIN;
    }

    System.out.println("Weather state: " + this.weatherState);
  }
}
