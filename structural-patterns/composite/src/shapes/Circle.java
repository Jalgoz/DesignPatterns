package shapes;

import java.awt.*;

public class Circle extends BaseShape {
  private int radius;

  public Circle(int x, int y, int radius, Color color) {
    super(x, y, color);
    this.radius = radius;
  }

  @Override
  public int getWidth() {
    return this.radius * 2;
  }

  @Override
  public int getHeight() {
    return this.radius * 2;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.drawOval(super.getX(), super.getY(), getWidth() -  1, getHeight() - 1);
  }
}
