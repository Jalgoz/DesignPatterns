package ui;

import states.ReadyState;
import states.State;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private State state;
  private boolean playing = false;
  private List<String> playlist = new ArrayList<>();
  private int currentTrack = 0;

  public Player() {
    this.state = new ReadyState(this);
    this.playing = true;

    for (int i = 1; i <= 12; i++) {
      this.playlist.add("Track " + i);
    }
  }

  public void changeState(State state) {
    this.state = state;
  }

  public State getState() {
    return this.state;
  }

  public void setPlaying(boolean playing) {
    this.playing = playing;
  }

  public boolean isPlaying() {
    return this.playing;
  }

  public String startPlayback() {
    return "Playing " + this.playlist.get(this.currentTrack);
  }

  public String nextTrack() {
    this.currentTrack++;
    if (this.currentTrack > this.playlist.size() - 1) {
      this.currentTrack = 0;
    }

    return "Playing " + this.playlist.get(this.currentTrack);
  }

  public String previousTrack() {
    this.currentTrack--;
    if (this.currentTrack < 0) {
      this.currentTrack = this.playlist.size() - 1;
    }

    return "Playing " + this.playlist.get(this.currentTrack);
  }

  public void setCurrentTrackAfterStop() {
    this.currentTrack = 0;
  }
}
