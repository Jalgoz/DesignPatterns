import products.Box;
import products.Product;

import java.util.UUID;

public class Main {
  public static void main(String[] args) {
    Box simpleBox = new Box(UUID.randomUUID(),
        new Product(UUID.randomUUID(), "Doll", 15.5f));

    Box compoundBox = new Box(
        UUID.randomUUID(),
        simpleBox,
        new Box(
            UUID.randomUUID(),
            new Product(UUID.randomUUID(), "Ball", 10f),
            new Product(UUID.randomUUID(), "Lego's city", 280.99f),
            new Product(UUID.randomUUID(), "HotWheel", 30f),
            new Product(UUID.randomUUID(), "Barbie", 100f)
        ),
        new Product(UUID.randomUUID(), "Keyboard", 75f)
    );

    System.out.println(compoundBox.printProduct());
    System.out.println("Total amount: " + compoundBox.amount() + "$");
  }
}