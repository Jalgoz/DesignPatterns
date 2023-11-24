package networks;

/**
 * Base class for the social network
 */
public abstract class Network {
  protected String username;
  protected String password;

  public Network() {}

  /**
   * Publish the data to whatever network.
   */
  public boolean post(String message) {
    // Authenticate before posting. Every network uses a different
    // authentication method.
    if (logIn(this.username, this.password)) {
      boolean result = sendData(message.getBytes());
      logOut();

      return result;
    }

    return false;
  }

  protected void simulateNetworkLatency() {
    try {
      int i = 0;
      System.out.println();
      while (i < 10) {
        System.out.print(".");
        Thread.sleep(200);
        i++;
      }
    } catch (InterruptedException exception) {
      exception.printStackTrace();
    }
  }

  public abstract boolean logIn(String username, String password);
  public abstract boolean sendData(byte[] data);
  public abstract void logOut();
}
