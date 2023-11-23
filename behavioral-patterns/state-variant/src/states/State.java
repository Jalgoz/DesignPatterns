package states;

import context.VendingMachine;

public abstract class State {
  protected VendingMachine vendingMachine;

  public State(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  public abstract void insertMoney();
  public abstract void ejectMoney();
  public abstract void dispenseItem();
}
