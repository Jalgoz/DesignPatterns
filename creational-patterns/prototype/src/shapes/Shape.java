package shapes;

import java.util.Objects;

public abstract class Shape {
  private int x;
  private int y;
  private String color;

  public Shape() {
  }

  public Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  public Shape(Shape target) {
    if (target != null) {
      this.x = target.x;
      this.y = target.y;;
      this.color = target.color;
    }
  }

  public abstract Shape clone();

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String getColor() {
    return color;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Shape)) return false;
    Shape shape = (Shape) object2;
    return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
  }

  @Override
  public String toString() {
    return " Shape{" +
        "x=" + x +
        ", y=" + y +
        ", color='" + color + '\'' +
        "}";
  }
}
