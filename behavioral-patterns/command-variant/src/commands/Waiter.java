package commands;

/**
 * Invoke class
 */
public class Waiter {
  private Command command;

  public Waiter(Command command) {
    this.command = command;
  }

  public void takeOrder() {
    command.execute();;
  }

  public void setCommand(Command command) {
    this.command = command;
  }
}
