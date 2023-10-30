import decorators.BaseNotifier;
import decorators.EmailNotifier;
import decorators.FacebookNotifier;
import decorators.SMSNotifier;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    EmailNotifier emailNotifier = new EmailNotifier();
    emailNotifier.addAddressEmails(List.of("example@example.com", "example2@example.com"));

    SMSNotifier smsNotifier = new SMSNotifier(emailNotifier);
    smsNotifier.addNumberPhones("73097389");
    smsNotifier.addNumberPhones(List.of("78843221", "64862622"));

    BaseNotifier notifier = new BaseNotifier(new FacebookNotifier(smsNotifier));
    notifier.sendNotification("Hello");
  }
}