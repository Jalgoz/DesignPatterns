package round;

public abstract class Round {
  private double radius;

  public Round() {
  }

  public Round(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}
