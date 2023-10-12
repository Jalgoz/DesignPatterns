package devices;

public class Radio extends Device {
  private float station = 80;

  public Radio() {
  }

  public Radio(boolean on, int volume, float station) {
    super(on, volume);
    this.station = station;
  }

  @Override
  public Number getChannel() {
    return this.station;
  }

  @Override
  public void channelUp() {
    this.station += 0.1f;
  }

  @Override
  public void channelDown() {
    this.station -= 0.1f;
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm a radio.");
    System.out.println("| I'm " + (super.isEnabled() ? "enabled" : "disabled"));
    System.out.println("| Current volume is " + super.getVolume() + "%");
    System.out.println("| Current channel is " + this.station);
    System.out.println("------------------------------------\n");
  }
}
