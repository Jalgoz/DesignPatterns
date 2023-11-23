package airport;

import mediator.Mediator;

public class Plane extends Aircraft {
  private String planeType;

  public Plane(String name, String origin, String planeType) {
    super(name, origin);
    this.planeType = planeType;
  }

  public String getPlaneType() {
    return planeType;
  }

  public void setPlaneType(String planeType) {
    this.planeType = planeType;
  }
}
