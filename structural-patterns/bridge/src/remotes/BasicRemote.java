package remotes;

import devices.Device;

public class BasicRemote implements Remote {
  protected Device device;

  public BasicRemote() {
  }

  public BasicRemote(Device device) {
    this.device = device;
  }

  @Override
  public void power() {
    System.out.println("Remote: power toggle");
    if (device.isEnabled()) {
      device.disable();
    } else {
      device.enable();
    }
  }

  @Override
  public void volumeDown() {
    System.out.println("Remote: volume down");
    if (device.getVolume() != 0) {
      device.setVolume(device.getVolume() - 1);
    }
    System.out.println("Remote: volume " + device.getVolume());
  }

  @Override
  public void volumeUp() {
    System.out.println("Remote: volume up");
    if (device.getVolume() != 100) {
      device.setVolume(device.getVolume() + 1);
    }
    System.out.println("Remote: volume " + device.getVolume());
  }

  @Override
  public void channelDown() {
    System.out.println("Remote: channel down");
    if (device.getChannel().intValue() >= 0) {
      device.channelDown();
    }
    System.out.println("Remote: channel " + device.getChannel());
  }

  @Override
  public void channelUp() {
    System.out.println("Remote: channel up");
    if (device.getChannel().intValue() <= 500) {
      device.channelUp();
    }
    System.out.println("Remote: channel " + device.getChannel());
  }
}
