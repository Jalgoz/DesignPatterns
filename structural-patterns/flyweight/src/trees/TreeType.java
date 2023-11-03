package trees;

import java.awt.*;

/**
 * Contains state shared by several trees
 */
public class TreeType {
  private final String name;
  private final Color color;
  private final String otherTreeData;

  public TreeType(String name, Color color, String otherTreeData) {
    this.name = name;
    this.color = color;
    this.otherTreeData = otherTreeData;
  }

  public void draw(Graphics graphics, int x, int y) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x - 1, y, 3, 5);
    graphics.setColor(this.color);
    graphics.fillOval(x - 5, y - 10, 10, 10);
  }
}
