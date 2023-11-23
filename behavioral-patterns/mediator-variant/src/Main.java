import airport.Aircraft;
import airport.Helicopter;
import airport.Plane;
import airport.Status;
import mediator.ControlTower;
import mediator.Mediator;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Aircraft> aircraftList = List.of(
        new Plane("F-16", "USA", "Fighter plane"),
        new Helicopter("Apache", "UK", "Fighter helicopter"),
        new Plane("F-32", "USA", "Fighter plane")
    );

    Mediator controlTower = new ControlTower(aircraftList);

    aircraftList.get(0).setStatus(Status.LANDING);
    aircraftList.get(1).setStatus(Status.LANDING);
    aircraftList.get(2).setStatus(Status.LANDING);

    controlTower.emergencyLanding(aircraftList.get(2));

    controlTower.printStatus();
  }
}