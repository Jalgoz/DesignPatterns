package strategies;

public class WalkingStrategy implements RouteStrategy {
  private final String timeStart;

  public WalkingStrategy(String timeStart) {
    this.timeStart = timeStart;
  }

  @Override
  public void buildRoute(String startRoute, String endRoute) {
    System.out.println("WALKING STRATEGY");
    System.out.printf("The route start(%s) from: %s\nand ends: %s", this.timeStart, startRoute, endRoute);
  }
}
