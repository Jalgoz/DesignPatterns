package shapes;

import visitor.Visitor;

public class Dot implements Shape {
  private int id;
  private int x;
  private int y;

  public Dot() {}

  public Dot(int id, int x, int y) {
    this.id = id;
    this.x = x;
    this.y = y;
  }

  public int getId() {
    return id;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public void move(int x, int y) {
    // Move shape
  }

  @Override
  public void draw() {
    // Draw shape
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitDot(this);
  }
}
