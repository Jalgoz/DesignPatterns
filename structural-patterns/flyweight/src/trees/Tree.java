package trees;

import java.awt.*;

/**
 * Contains state unique for each three
 */
public class Tree {
  private final int x;
  private final int y;
  private final TreeType treeType;

  public Tree(int x, int y, TreeType treeType) {
    this.x = x;
    this.y = y;
    this.treeType = treeType;
  }

  public void draw (Graphics graphics) {
    treeType.draw(graphics, x, y);
  }
}
