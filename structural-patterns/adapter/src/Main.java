import adapter.SquarePegAdapter;
import round.Round;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Main {
  public static void main(String[] args) {
    RoundHole roundHole = new RoundHole(5);
    Round roundPeg = new RoundPeg(5);

    System.out.println("Fits: " + roundHole.fits(roundPeg));

    SquarePeg smallSquare = new SquarePeg(2);
    SquarePeg bigSquare = new SquarePeg(10);

    SquarePegAdapter smallSquareAdapter = new SquarePegAdapter(smallSquare);
    SquarePegAdapter bigSquareAdapter = new SquarePegAdapter(bigSquare);

    System.out.printf("Small square fits = %b\n", roundHole.fits(smallSquareAdapter));
    System.out.printf("Big square fits = %b\n", roundHole.fits(bigSquareAdapter));
  }
}