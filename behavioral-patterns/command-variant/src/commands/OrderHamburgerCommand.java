package commands;

public class OrderHamburgerCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Order a hamburger");
  }
}
