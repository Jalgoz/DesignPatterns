package decorators;

import java.util.ArrayList;
import java.util.List;

public class EmailNotifier implements Notifier {
  private final List<String> addressEmails = new ArrayList<>();

  public List<String> getAddressEmails() {
    return addressEmails;
  }

  public void addAddressEmails(List<String> addressEmails) {
    this.addressEmails.addAll(addressEmails);
  }

  public void addAddressEmails(String addressEmail) {
    this.addressEmails.add(addressEmail);
  }

  public void removeAddressEmails(String addressEmail) {
    this.addressEmails.remove(addressEmail);
  }

  public void removeAddressEmails(List<String> addressEmails) {
    this.addressEmails.removeAll(addressEmails);
  }

  public void clear() {
    this.addressEmails.clear();
  }

  @Override
  public void sendNotification(String message) {
    if (addressEmails.size() == 0) {
      return;
    }

    addressEmails.forEach(addressEmails ->
      System.out.printf("Email to %s: %s%n", addressEmails, message));
  }
}
