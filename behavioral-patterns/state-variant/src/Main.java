import context.VendingMachine;

public class Main {
  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();

    vendingMachine.dispenseItem();
    vendingMachine.insertMoney();
    vendingMachine.dispenseItem();

    vendingMachine.ejectMoney();
    vendingMachine.insertMoney();
    vendingMachine.ejectMoney();
    vendingMachine.dispenseItem();
  }
}