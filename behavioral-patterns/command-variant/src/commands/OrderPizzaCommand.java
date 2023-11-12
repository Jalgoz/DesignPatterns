package commands;

public class OrderPizzaCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Order a pizza");
  }
}
