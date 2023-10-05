package AbstractFactory;

import AbstractProducts.Button;
import AbstractProducts.Checkbox;

/**
 * In this interface we define the methods to create the abstract products,
 * it'll be implemented in the concrete factories with the concrete products
 */
public interface GUIFactory {
  Button createButton();
  Checkbox createCheckbox();
}
