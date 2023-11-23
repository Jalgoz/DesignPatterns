package context;

import states.NoMoneyState;
import states.State;

/**
 * This class has different states
 */
public class VendingMachine {
  private State currentState;

  public VendingMachine() {
    this.currentState = new NoMoneyState(this);
  }

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

  public void insertMoney() {
    this.currentState.insertMoney();
  }

  public void ejectMoney() {
    this.currentState.ejectMoney();
  }

  public void dispenseItem() {
    this.currentState.dispenseItem();
  }
}
