package products;

import java.util.UUID;

public class Product implements BaseProduct {
  private final UUID id;
  private String name;
  private float amount;

  public Product(UUID id, String name, float amount) {
    this.id = id;
    this.name = name;
    this.amount = amount;
  }

  public UUID getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  @Override
  public String printProduct() {
    return this.name;
  }

  @Override
  public float amount() {
    return this.amount;
  }
}
