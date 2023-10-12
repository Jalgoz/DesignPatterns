package devices;

public class Tv extends Device {
  private int channel = 1;

  public Tv() {
  }

  public Tv(boolean on, int volume, int channel) {
    super(on, volume);
    this.channel = channel;
  }

  @Override
  public Number getChannel() {
    return this.channel;
  }

  @Override
  public void channelUp() {
    this.channel += 1;
  }

  @Override
  public void channelDown() {
    this.channel -= 1;
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm a tv.");
    System.out.println("| I'm " + (super.isEnabled() ? "enabled" : "disabled"));
    System.out.println("| Current volume is " + super.getVolume() + "%");
    System.out.println("| Current channel is " + this.channel);
    System.out.println("------------------------------------\n");
  }
}
