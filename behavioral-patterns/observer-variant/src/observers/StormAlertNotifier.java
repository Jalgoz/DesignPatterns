package observers;

import weather.Weather;

/**
 * This class represents a Storm Alert Notifies,
 * it can send an alert
 */
public class StormAlertNotifier implements Observer {
  private boolean stormAlert;

  public StormAlertNotifier() {
    this.stormAlert = false;
  }

  private void notifyStorm() {
    if (this.stormAlert) {
      System.out.println("ALERT: Storm is expected. Take necessary precautions!");
    }
  }

  @Override
  public void update(Weather weather) {
    if (weather.getWindSpeed() > 60) {
      this.stormAlert = true;
    } else {
      this.stormAlert = false;
    }

    notifyStorm();
  }
}
