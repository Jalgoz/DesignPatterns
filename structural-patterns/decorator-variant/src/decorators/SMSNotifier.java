package decorators;

import java.util.ArrayList;
import java.util.List;

public class SMSNotifier extends BaseNotifier {
  private final List<String> numberPhones = new ArrayList<>();

  public SMSNotifier(Notifier wrapper) {
    super(wrapper);
  }

  public List<String> getNumberPhones() {
    return numberPhones;
  }

  public void addNumberPhones(List<String> numberPhones) {
    this.numberPhones.addAll(numberPhones);
  }

  public void addNumberPhones(String numberPhone) {
    this.numberPhones.add(numberPhone);
  }

  public void removeNumberPhones(String numberPhone) {
    this.numberPhones.remove(numberPhone);
  }

  public void removeNumberPhones(List<String> numberPhones) {
    this.numberPhones.removeAll(numberPhones);
  }

  public void clearNumberPhone(List<String> numberPhones) {
    this.numberPhones.clear();
  }

  @Override
  public void sendNotification(String message) {
    super.sendNotification(message);
    numberPhones.forEach(phone -> System.out.printf("SMS to %s: %s%n", phone, message));
  }
}
