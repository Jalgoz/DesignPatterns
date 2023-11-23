package states;

import ui.Player;

/**
 * They can also trigger state transitions in the context.
 */
public class ReadyState extends State {
  public ReadyState(Player player) {
    super(player);
  }

  @Override
  public String onLock() {
    super.player.changeState(new LockedState(super.player));

    return "Locked";
  }

  @Override
  public String onPlay() {
    String action = super.player.startPlayback();
    super.player.changeState(new PlayingState(super.player));

    return action;
  }

  @Override
  public String onNext() {
    return "Locked";
  }

  @Override
  public String onPrevious() {
    return "Locked";
  }
}
