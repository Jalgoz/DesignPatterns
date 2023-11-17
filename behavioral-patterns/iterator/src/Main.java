import entities.NameRepository;
import iterators.Iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Jose", "Esmeralda", "Paola");
    NameRepository repository = new NameRepository(names);
    Iterator iterator = repository.createIterator();

    while (iterator.hastNext()) {
      System.out.println(iterator.next());
    }
  }
}