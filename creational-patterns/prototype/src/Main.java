import cache.BundleShapeCache;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Main {
  public static void main(String[] args) {
    BundleShapeCache cache = new BundleShapeCache();

    Shape circle = new Circle(10, 20, "red" , 15);

    Shape cloneCircle = circle.clone();

    Shape anotherCircle = new Circle(15, 25, "white" , 15);
    
    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(10);
    rectangle.setHeight(20);
    rectangle.setColor("blue");

    Shape cloneRectangle = rectangle.clone();

    System.out.println(circle);
    System.out.println(cloneCircle);
    System.out.println(rectangle);
    System.out.println(cloneRectangle);

    System.out.println(circle.equals(cloneCircle));
    System.out.println(circle.equals(anotherCircle));

    System.out.println("----------CACHE----------");
    Shape bigRedCircle = cache.get("BRC");
    System.out.println(bigRedCircle);

    cache.put("MRC", circle);
    Shape mediumRedCircle = cache.get("MRC");
    System.out.println(mediumRedCircle);
    System.out.println(circle.equals(mediumRedCircle) && mediumRedCircle.equals(cloneCircle));
  }
}