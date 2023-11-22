package observers;

import weather.Weather;

public interface Observer {
  void update(Weather weather);
}
