package shapes;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
  private final int id;
  private final List<Shape> children = new ArrayList<>();

  public CompoundShape(int id) {
    this.id = id;
  }

  public void addChildren(Shape shape) {
    this.children.add(shape);
  }

  public List<Shape> getChildren() {
    return children;
  }

  public int getId() {
    return id;
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
    return visitor.visitCompoundGraphic(this);
  }
}
