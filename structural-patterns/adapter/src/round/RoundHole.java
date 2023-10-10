package round;

public class RoundHole extends Round {
  public RoundHole(double radius) {
    super(radius);
  }

  public boolean fits(Round roundPeg) {
    return super.getRadius() >= roundPeg.getRadius();
  }
}
