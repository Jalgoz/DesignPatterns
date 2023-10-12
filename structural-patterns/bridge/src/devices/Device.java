package devices;

public abstract class Device {
  private boolean on = false;
  private int volume = 30;

  public Device() {
  }

  public Device(boolean on, int volume) {
    this.on = on;
    this.volume = volume;
  }

  public final boolean isEnabled() {
    return this.on;
  }
  public final void enable() {
    this.on = true;
  }
  public final void disable() {
    this.on = false;
  }
  public final int getVolume() {
    return this.volume;
  }
  public final void setVolume(int percent) {
    this.volume = percent;
  }
  public abstract Number getChannel();
  public abstract void channelUp();
  public abstract void channelDown();
  public abstract void printStatus();
}
