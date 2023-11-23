package states;

import ui.Player;

public class PlayingState extends State {
  public PlayingState(Player player) {
    super(player);
  }

  @Override
  public String onLock() {
    super.player.changeState(new LockedState(super.player));
    super.player.setCurrentTrackAfterStop();

    return "Stop playing";
  }

  @Override
  public String onPlay() {
    super.player.changeState(new ReadyState(super.player));

    return "Paused";
  }

  @Override
  public String onNext() {
    return super.player.nextTrack();
  }

  @Override
  public String onPrevious() {
    return super.player.previousTrack();
  }
}
