package strategies;

/**
 * Dummy credit card class.
 */
public class CreditCard {
  private int amount;
  private final String number;
  private final String date;
  private final String cvv;

  CreditCard(String number, String date, String cvv) {
    this.amount = 100_000;
    this.number = number;
    this.date = date;
    this.cvv = cvv;
  }

  public void setAmount(int amount) {
    if (amount>= 0) {
      this.amount = amount;

      return;
    }

    System.out.println("Insufficient founds !!");
  }

  public int getAmount() {
    return amount;
  }
}
