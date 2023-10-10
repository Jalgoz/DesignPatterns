package shapes;

import java.util.Objects;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle() {
  }

  public Rectangle(Rectangle target) {
    super(target);
    if (null != target) {
      this.height = target.height;
      this.width = target.width;
    }
  }

  public Rectangle(int x, int y, String color, int width, int height) {
    super(x, y, color);
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (this == object2) return true;
    if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
    Rectangle rectangle = (Rectangle) object2;
    return width == rectangle.width && height == rectangle.height;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + width +
        ", height=" + height +
        super.toString() +
        "}\n";
  }
}
