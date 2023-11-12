import commands.*;

public class Main {
  public static void main(String[] args) {
    Command orderPizza = new OrderPizzaCommand();
    Command orderHamburger = new OrderHamburgerCommand();
    Waiter waiter = new Waiter(orderPizza);
    PedidosYa pedidosYa = new PedidosYa(orderHamburger);

    waiter.takeOrder();
    pedidosYa.takeOrder();

    waiter.setCommand(orderHamburger);

    waiter.takeOrder();
  }
}