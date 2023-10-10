package adapter;

import round.Round;
import square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends Round {
  private final SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    this.squarePeg = squarePeg;
  }

  @Override
  public double getRadius() {
    // Calculate a minimum circle radius, which can fit this peg.
    return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
  }
}
