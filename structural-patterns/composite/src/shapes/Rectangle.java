package shapes;

import java.awt.*;

public class Rectangle extends BaseShape {
  private int width;
  private int height;

  public Rectangle(int x, int y, int width, int height, Color color) {
    super(x, y, color);
    this.width = width;
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int getWidth() {
    return this.width;
  }

  @Override
  public int getHeight() {
    return this.height;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.drawRect(super.getX(), super.getY(), getWidth() - 1, getHeight() - 1);
  }
}
