import shapes.*;
import visitor.XMLExportVisitor;

public class Main {
  public static void main(String[] args) {
    Dot dot = new Dot(1, 10, 55);
    Circle circle = new Circle(2, 23, 15, 10);
    Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

    CompoundShape compoundShape = new CompoundShape(4);
    compoundShape.addChildren(dot);
    compoundShape.addChildren(circle);
    compoundShape.addChildren(rectangle);

    CompoundShape compoundShape2 = new CompoundShape(5);
    compoundShape2.addChildren(circle);
    compoundShape.addChildren(compoundShape2);

    export(circle, compoundShape);
  }

  private static void export(Shape... shapes) {
    XMLExportVisitor exportVisitor = new XMLExportVisitor();
    System.out.println(exportVisitor.export(shapes));
  }
}