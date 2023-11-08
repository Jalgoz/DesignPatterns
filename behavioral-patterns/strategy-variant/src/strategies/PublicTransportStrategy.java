package strategies;

import transport.PublicTransportTypes;

public class PublicTransportStrategy implements Navigator {
  private final PublicTransportTypes transportType;

  public PublicTransportStrategy(PublicTransportTypes transportType) {
    this.transportType = transportType;
  }

  @Override
  public void buildRoute(String startRoute, String endRoute) {
    System.out.println("PUBLIC TRANSPORT STRATEGY");
    System.out.printf("The %s leaves from: %s\nto: %s", transportType, startRoute, endRoute );
  }
}
