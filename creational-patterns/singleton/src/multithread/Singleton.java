package multithread;

public class Singleton {
  // The field must be declared volatile so that double check lock would work correctly.
  private static volatile Singleton instance;

  private String value;

  private Singleton(String value) {
    this.value = value;
  }

  public static Singleton getInstance(String value) {
    Singleton result = instance;
    if (result != null) { // We check if instance(result) exist
      return result; // If exist we return instance(result)
    }
    synchronized(Singleton.class) { // This ensures that only one thread can access the code block at a time.
      if (instance == null) { // We make double check
        instance = new Singleton(value);
      }

      return instance;
    }
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
