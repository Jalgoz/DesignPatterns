package strategies;

public class Navigator {
  private RouteStrategy strategy;

  public Navigator() {
  }

  public Navigator(RouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(RouteStrategy strategy) {
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
