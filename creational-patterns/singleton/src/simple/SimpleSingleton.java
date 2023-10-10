package simple;

public class SimpleSingleton {
  private static SimpleSingleton instance;
  private String value;

  private SimpleSingleton(String value) {
    this.value = value;
  }

  public static SimpleSingleton getInstance(String value) {
    if (null == instance) {
      instance = new SimpleSingleton(value);
    }

    return instance;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
