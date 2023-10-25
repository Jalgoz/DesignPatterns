package products;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.DoubleStream;

public class Box implements BaseProduct {
  private final UUID id;
  private List<BaseProduct> products;

  public Box(UUID id) {
    this.id = id;
  }

  public Box(UUID id, BaseProduct... products) {
    this.id = id;
    this.products = Arrays.asList(products);
  }

  public UUID getId() {
    return id;
  }

  public List<BaseProduct> getProducts() {
    return products;
  }

  public void addProduct(BaseProduct product) {
    this.products.add(product);
  }

  public void addProduct(BaseProduct... products) {
    this.products.addAll(Arrays.asList(products));
  }

  /**
   * This method operates recursively, it calls all the boxes
   * and the boxes call all the products, it's important to note that a container box
   * treats child box like if they were products.
   *
   * @return all the products and boxes
   */
  @Override
  public String printProduct() {
    if (products.size() == 0) return "";

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("------BOX------\n");
    products.forEach(product ->
        stringBuilder.append(product.printProduct())
            .append(": ")
            .append(product.amount())
            .append("$")
            .append(System.lineSeparator())
    );

    return stringBuilder.append("---------------\n").toString();
  }

  @Override
  public float amount() {
    return (float) products.stream()
        .flatMapToDouble(product -> DoubleStream.of(product.amount())).sum();
  }
}
