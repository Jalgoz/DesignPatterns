package shapes;

import java.util.Objects;

public class Circle extends Shape {
  private int radius;

  public Circle() {
  }

  public Circle(Circle target) {
    super(target);
    if (null != target) {
      this.radius = target.radius;
    }
  }

  public Circle(int x, int y, String color, int radius) {
    super(x, y, color);
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (this == object2) return true;
    if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
    Circle circle = (Circle) object2;
    return radius == circle.radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        super.toString() +
        "}\n";
  }
}
