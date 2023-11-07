package order;

import strategies.PayStrategy;

/**
 * Order class. Doesn't know the concrete payment method (strategy) user has
 * picked. It uses common strategy interface to delegate collecting payment data
 * to strategy object. It can be used to save order to database.
 */
public class Order {
  private int totalCost = 0;
  private boolean isClosed = false;
  private PayStrategy strategy;

  public void processOrder(PayStrategy strategy) {
    this.strategy = strategy;
    this.strategy.collectPaymentDetails();
  }

  public boolean pay(int amount) {
    return this.strategy.pay(amount);
  }

  public int getTotalCost() {
    return this.totalCost;
  }

  public void setTotalCost(int totalCost) {
    this.totalCost = totalCost;
  }

  public boolean isClosed() {
    return this.isClosed;
  }

  public void setClosed(boolean closed) {
    this.isClosed = closed;
  }
}
