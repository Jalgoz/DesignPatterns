package states;

import context.VendingMachine;

public class NoMoneyState extends State {
  public NoMoneyState(VendingMachine vendingMachine) {
    super(vendingMachine);
  }

  @Override
  public void insertMoney() {
    System.out.println("Money inserted. You can now select an item.");
    super.vendingMachine.setCurrentState(new HasMoneyState(super.vendingMachine));
  }

  @Override
  public void ejectMoney() {
    System.out.println("No money to eject.");
  }

  @Override
  public void dispenseItem() {
    System.out.println("Please insert money first.");
  }
}
