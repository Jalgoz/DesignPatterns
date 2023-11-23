package airport;

import mediator.Mediator;

import java.util.Objects;

public abstract class Aircraft {
  private Mediator mediator;
  private Status status;
  private String name;
  private String brand;

  public Aircraft(String name, String brand) {
    this.name = name;
    this.brand = brand;
    this.status = Status.UNKNOWN;
  }

  public String getName() {
    return name;
  }

  public String getBrand() {
    return brand;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void setStatus(Status status) {
    switch (status) {
      case LANDING:
        if (mediator.requestLanding()) {
          this.status = Status.LANDING;

          return;
        }
        break;

      case TAKING_OFF:
        if (mediator.requestTakeOff()) {
          this.status = Status.TAKING_OFF;

          return;
        }
        break;
    }

    this.status = Status.IN_AIR;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Aircraft aircraft = (Aircraft) object;
    return Objects.equals(mediator, aircraft.mediator) && status == aircraft.status && Objects.equals(name, aircraft.name) && Objects.equals(brand, aircraft.brand);
  }
}
