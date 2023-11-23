import ui.Player;
import ui.UI;

public class Main {
  public static void main(String[] args) {
    final Player player = new Player();
    UI ui = new UI(player);
    ui.init();
  }
}