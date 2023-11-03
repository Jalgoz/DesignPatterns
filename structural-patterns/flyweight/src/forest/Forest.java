package forest;

import trees.Tree;
import trees.TreeFactory;
import trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class helps to draw every tree
 */
public class Forest extends JFrame {
  private final List<Tree> trees = new ArrayList<>();

  public void plantTree(int x, int y, String name, Color color, String anotherTreeData) {
    TreeType type = TreeFactory.getTreeType(name, color, anotherTreeData);
    Tree tree = new Tree(x, y, type);
    trees.add(tree);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Tree tree: trees) {
      tree.draw(graphics);
    }
  }
}
