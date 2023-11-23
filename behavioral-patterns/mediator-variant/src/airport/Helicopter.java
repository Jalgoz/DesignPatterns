package airport;

public class Helicopter extends Aircraft {
  private String helicopterType;

  public Helicopter(String name, String origin, String planeType) {
    super(name, origin);
    this.helicopterType = planeType;
  }

  public String getHelicopterType() {
    return helicopterType;
  }

  public void setHelicopterType(String helicopterType) {
    this.helicopterType = helicopterType;
  }
}
