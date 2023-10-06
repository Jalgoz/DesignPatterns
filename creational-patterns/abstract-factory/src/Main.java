import AbstractFactory.GUIFactory;
import ConcreteFactory.MacOSFactory;
import ConcreteFactory.WindowsFactory;

import java.util.Locale;

public class Main {
  public static InterfaceCreation configureApplication() {
    GUIFactory factory;

    String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);

    if (osName.contains("mac")) {
      factory = new MacOSFactory();
    } else {
      factory = new WindowsFactory();
    }

    return new InterfaceCreation(factory);
  };

  public static void main(String[] args) {
    InterfaceCreation interfaceCreation = configureApplication();
    interfaceCreation.getButton().paint();
    interfaceCreation.getCheckbox().paint();
    interfaceCreation.click(5);
    System.out.println("------------");
    interfaceCreation.paint();
  }
}