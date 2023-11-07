package strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete strategy. Implements {@link PayStrategy} payment methods
 */
public class PayByPayPal implements PayStrategy {
  private static final Map<String, String> DATA_BASE = new HashMap<>();
  private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private String email;
  private String password;
  private boolean signedIn;

  static {
    DATA_BASE.put("amanda1985", "amanda@ya.com");
    DATA_BASE.put("qwerty", "john@amazon.eu");
  }

  private void setSignedIn(boolean signedIn) {
    this.signedIn = signedIn;
  }

  private boolean verify() {
    setSignedIn(email.equals(DATA_BASE.get(password)));

    return this.signedIn;
  }


  @Override
  public boolean pay(int paymentAmount) {
    if (signedIn) {
      System.out.println("Paying " + paymentAmount + " using PayPal.");

      return true;
    }

    return false;
  }

  /**
   * Collect customer's data
   */
  @Override
  public void collectPaymentDetails() {
    try {
      System.out.print("Enter the user's email: ");
      this.email = READER.readLine();
      System.out.print("Enter the password: ");
      this.password = READER.readLine();


      if (verify()) {
        System.out.println("Data verification has been successful");
      } else {
        System.out.println("Wrong email or password");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
