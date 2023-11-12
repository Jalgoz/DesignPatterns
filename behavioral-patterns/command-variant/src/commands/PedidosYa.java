package commands;

/**
 * New invoke class
 */
public class PedidosYa {
  private Command command;

  public PedidosYa(Command command) {
    this.command = command;
  }

  public void takeOrder() {
    command.execute();
  }

  public void setCommand(Command command) {
    this.command = command;
  }
}
