package states;

import context.VendingMachine;

public class HasMoneyState extends State {
  public HasMoneyState(VendingMachine vendingMachine) {
    super(vendingMachine);
  }

  @Override
  public void insertMoney() {
    System.out.println("Money already inserted. You can select an item.");
  }

  @Override
  public void ejectMoney() {
    System.out.println("Money ejected.");
    super.vendingMachine.setCurrentState(new NoMoneyState(super.vendingMachine));
  }

  @Override
  public void dispenseItem() {
    System.out.println("Item dispensed. Enjoy!");
    super.vendingMachine.setCurrentState(new NoMoneyState(super.vendingMachine));
  }
}
