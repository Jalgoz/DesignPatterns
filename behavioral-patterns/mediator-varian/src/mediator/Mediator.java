package mediator;

import airport.Aircraft;

public interface Mediator {
  void registerAircraft();
  boolean requestLanding();
  boolean requestTakeOff();
  void emergencyLanding(Aircraft aircraftSOS);
  void printStatus();
}
