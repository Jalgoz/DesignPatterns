import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();
    List<Shape> shapesCopy = new ArrayList<>();

    Shape circle = new Circle(10, 20, "red" , 15);
    shapes.add(circle);

    Shape cloneCircle = circle.clone();
    shapes.add(cloneCircle);

    Shape anotherCircle = new Circle(15, 25, "white" , 15);
    
    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(10);
    rectangle.setHeight(20);
    rectangle.setColor("blue");
    shapes.add(rectangle);

    Shape cloneRegtangle = rectangle.clone();
    shapes.add(cloneRegtangle);

    // cloneAndCompare(shapes, shapesCopy);
    System.out.println(circle);
    System.out.println(cloneCircle);
    System.out.println(rectangle);
    System.out.println(cloneRegtangle);

    System.out.println(circle.equals(cloneCircle));
    System.out.println(circle.equals(anotherCircle));
  }

  private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
    for(Shape shape: shapes) {
      shapesCopy.add(shape.clone());
    }

    for (int i = 0; i < shapes.size(); i++) {
      if (shapes.get(i) != shapesCopy.get(i)) {
        System.out.println(i + ": Shapes are different objects (yay!)");
        if (shapes.get(i).equals(shapesCopy.get(i))) {
          System.out.println(i + ": And they are identical (yay!)");
        } else {
          System.out.println(i + ": But they are not identical (booo!)");
        }
      } else {
        System.out.println(i + ": Shape objects are the same (booo!)");
      }
    }
  }
}