package strategies;

public class RouteStrategy {
  private Navigator strategy;

  public RouteStrategy() {
  }

  public RouteStrategy(Navigator strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(Navigator strategy) {
    this.strategy = strategy;
  }

  public void initRoute(String startRoute, String endRoute) {
    if (null == strategy) {
      System.out.println("Strategy not founded");
      return;
    }

    this.strategy.buildRoute(startRoute, endRoute);
  }
}
