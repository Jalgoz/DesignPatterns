package mediator;

import airport.Aircraft;
import airport.Status;

import java.util.List;

public class ControlTower implements Mediator {
  private List<Aircraft> aircraftList;

  public ControlTower(List<Aircraft> aircraftList) {
    this.aircraftList = aircraftList;
    registerAircraft();
  }

  public void addAircraftList(Aircraft aircraft) {
    this.aircraftList.add(aircraft);
  }

  public void addAircraftList(List<Aircraft> aircraftList) {
    this.aircraftList.addAll(aircraftList);
  }

  @Override
  public void registerAircraft() {
    aircraftList.forEach(aircraft -> aircraft.setMediator(this));
  }

  @Override
  public boolean requestLanding() {
    for(Aircraft aircraft: aircraftList) {
      if (aircraft.getStatus().equals(Status.LANDING)) {
        return false;
      }
    }

    return true;
  }

  @Override
  public boolean requestTakeOff() {
    for(Aircraft aircraft: aircraftList) {
      if (aircraft.getStatus().equals(Status.TAKING_OFF)) {
        return false;
      }
    }

    return true;
  }

  @Override
  public void emergencyLanding(Aircraft aircraftSOS) {
    for(Aircraft aircraft: aircraftList) {
      if (!aircraft.equals(aircraftSOS)) {
        aircraft.setStatus(Status.IN_AIR);
      }
    }

    aircraftSOS.setStatus(Status.LANDING);
  }

  @Override
  public void printStatus() {
    aircraftList.forEach(aircraft -> {
      System.out.println(aircraft.getName() + ": " + aircraft.getStatus());
    });
  }
}
