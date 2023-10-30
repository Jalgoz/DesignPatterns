package decorators;

public class BaseNotifier implements Notifier {
  private final Notifier wrapper;

  public BaseNotifier(Notifier wrapper) {
    this.wrapper = wrapper;
  }

  @Override
  public void sendNotification(String message) {
    wrapper.sendNotification(message);
  }
}
