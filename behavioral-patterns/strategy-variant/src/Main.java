import strategies.RouteStrategy;
import strategies.PublicTransportStrategy;
import strategies.Navigator;
import strategies.WalkingStrategy;
import transport.PublicTransportTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final Navigator NAVIGATOR = new Navigator();
  private static final String ROUTE_START = "Calacoto";
  private static final String ROUTE_END = "Cota cota";

  public static void main(String[] args) {
    menu();

    try {
      RouteStrategy strategy;
      String strategyOption = READER.readLine();

      if (strategyOption.equals("1")) {
        System.out.println("Choose the transport type");
        Arrays.stream(PublicTransportTypes.values()).forEach(transport ->
            System.out.printf("%d. %s\n", transport.ordinal(), transport));
        String transportType = READER.readLine();

        strategy = new PublicTransportStrategy(PublicTransportTypes.values()[Integer.parseInt((transportType))]);
      } else {
        System.out.print("Enter the start time: ");
        String startTime = READER.readLine();

        strategy = new WalkingStrategy(startTime);
      }

      NAVIGATOR.setStrategy(strategy);
      NAVIGATOR.initRoute(ROUTE_START, ROUTE_END);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void menu() {
    System.out.println("Choose an option to begin the tour: ");
    System.out.println("1. Public transport ");
    System.out.println("2. Walking\n");
  }
}