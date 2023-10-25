package shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
  protected List<Shape> children = new ArrayList<>();

  public CompoundShape(Shape... components) {
    super(0, 0, Color.BLACK);
    this.add(components);
  }

  public void add(Shape component) {
    children.add(component);
  }

  public void add(Shape... components) {
    children.addAll(Arrays.asList(components));
  }

  public void remove(Shape child) {
    children.remove(child);
  }

  public void remove(Shape... child) {
    children.removeAll(Arrays.asList(child));
  }

  public void clear() {
    children.clear();
  }

  public CompoundShape(int x, int y, Color color) {
    super(x, y, color);
  }

  public boolean selectChildAt(int x, int y) {
    for (Shape child : children) {
      if (child.isInsideBounds(x, y)) {
        child.select();
        return true;
      }
    }
    return false;
  }

  @Override
  public int getX() {
    if (children.size() == 0) {
      return 0;
    }

    int x = children.get(0).getX();
    for (Shape child: children) {
      if (child.getX() < x) {
        x = child.getX();
      }
    }

    return x;
  }

  @Override
  public int getY() {
    if (children.size() == 0) {
      return 0;
    }

    int y = children.get(0).getY();
    for (Shape child: children) {
      if (child.getY() < y) {
        y = child.getY();
      }
    }

    return y;
  }

  @Override
  public int getWidth() {
    int maxWidth = 0;
    int x = this.getX();
    for (Shape child : children) {
      int childsRelativeX = child.getX() - x;
      int childWidth = childsRelativeX + child.getWidth();
      if (childWidth > maxWidth) {
        maxWidth = childWidth;
      }
    }
    return maxWidth;
  }

  @Override
  public int getHeight() {
    int maxHeight = 0;
    int y = this.getY();
    for (Shape child : children) {
      int childsRelativeY = child.getY() - y;
      int childHeight = childsRelativeY + child.getHeight();
      if (childHeight > maxHeight) {
        maxHeight = childHeight;
      }
    }
    return maxHeight;
  }

  @Override
  public void move(int x, int y) {
    children.forEach(child -> child.move(x, y));
  }

  @Override
  public boolean isInsideBounds(int x, int y) {
    for(Shape child: children) {
      if (child.isInsideBounds(x, y)) {
        return true;
      }
    }

    return false;
  }

  @Override
  public void unselect() {
    super.unselect();
    children.forEach(Shape::unselect);
  }

  @Override
  public void paint(Graphics graphics) {
    if (isSelected()) {
      enableSelectionStyle(graphics);
      graphics.drawRect(this.getX() - 1, this.getY() - 1, this.getWidth() + 1, this.getHeight() + 1);
      disableSelectionStyle(graphics);
    }

    for (Shape child : children) {
      child.paint(graphics);
    }
  }
}
