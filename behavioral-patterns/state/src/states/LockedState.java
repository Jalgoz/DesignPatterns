package states;

import ui.Player;

/**
 * Concrete states provide the special implementation for all interface methods
 */
public class LockedState extends State {
  public LockedState(Player player) {
    super(player);
    player.setPlaying(false);
  }

  @Override
  public String onLock() {
    if (super.player.isPlaying()) {
      super.player.changeState(new ReadyState(super.player));

      return "Stop playing";
    } else {
      return "Locked...";
    }
  }

  @Override
  public String onPlay() {
    super.player.changeState(new ReadyState(super.player));

    return "Ready";
  }

  @Override
  public String onNext() {
    return "Locked...";
  }

  @Override
  public String onPrevious() {
    return "Locked...";
  }
}
