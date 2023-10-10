package cache;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundleShapeCache {
  private final Map<String, Shape> cache = new HashMap<>();

  public BundleShapeCache() {
    Circle bigRedCircle = new Circle(20, 20, "Red", 10);
    Rectangle mediumBlueRectangle = new Rectangle();
    mediumBlueRectangle.setColor("Blue");
    mediumBlueRectangle.setWidth(20);
    mediumBlueRectangle.setHeight(15);

    cache.put("BRC", bigRedCircle);
    cache.put("MBR", mediumBlueRectangle);
  }

  public Shape put(String key, Shape shape) {
    cache.put(key, shape);
    return shape;
  }

  public Shape get(String key) {
    return cache.get(key).clone();
  }
}
