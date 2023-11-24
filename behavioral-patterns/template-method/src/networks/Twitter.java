package networks;

/**
 * Class of social network
 */
public class Twitter extends Network {
  public Twitter(String username, String password) {
    super.username = username;
    super.password = password;
  }

  @Override
  public boolean logIn(String username, String password) {
    System.out.println("\nChecking user's parameters");
    System.out.println("Name: " + super.username);
    System.out.print("Password: ");
    for(int i = 0; i < password.length(); i++) {
      System.out.print("*");
    }

    super.simulateNetworkLatency();
    System.out.println("\n\nLogIn success on Twitter");

    return true;
  }

  @Override
  public boolean sendData(byte[] data) {
    boolean messagePosted = true;
    if (messagePosted) {
      System.out.println("Message: '" + new String(data) + "' was posted on Twitter");

      return true;
    }

    return false;
  }

  @Override
  public void logOut() {
    System.out.println("User: " + super.username + "' was logged out from Twitter");
  }
}
