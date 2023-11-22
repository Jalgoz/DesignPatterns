package weather;

import publisher.Publisher;

/**
 * This class represents the weather
 */
public class Weather {
  private final Publisher publisher;
  private double temperature = 0;
  private double humidity = 0;
  private double windSpeed = 0;
  private double rainfallAmount = 0;
  private SkyCondition skyCondition = SkyCondition.GOOD;

  public Weather(Publisher publisher) {
    this.publisher = publisher;
  }

  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
    this.publisher.notifyObservers(this);
  }

  public double getHumidity() {
    return humidity;
  }

  public void setHumidity(double humidity) {
    this.humidity = humidity;
    this.publisher.notifyObservers(this);
  }

  public double getWindSpeed() {
    return windSpeed;
  }

  public void setWindSpeed(double windSpeed) {
    this.windSpeed = windSpeed;
    this.publisher.notifyObservers(this);
  }

  public double getRainfallAmount() {
    return rainfallAmount;
  }

  public void setRainfallAmount(double rainfallAmount) {
    this.publisher.notifyObservers(this);
    this.rainfallAmount = rainfallAmount;
  }

  public SkyCondition getSkyCondition() {
    return skyCondition;
  }

  public void setSkyCondition(SkyCondition skyCondition) {
    this.skyCondition = skyCondition;
    this.publisher.notifyObservers(this);
  }

  public Publisher getPublisher() {
    return publisher;
  }

  @Override
  public String toString() {
    return "Weather{" +
        "temperature=" + temperature +
        ", humidity=" + humidity +
        ", windSpeed=" + windSpeed +
        ", rainfallAmount=" + rainfallAmount +
        ", skyCondition=" + skyCondition +
        "}";
  }
}
