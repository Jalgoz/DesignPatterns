package decorators;

public class FacebookNotifier extends BaseNotifier {
  public FacebookNotifier(Notifier wrapper) {
    super(wrapper);
  }

  @Override
  public void sendNotification(String message) {
    super.sendNotification(message);
    System.out.println("Facebook notification: " + message);
  }
}
