package entities;

import iterators.Iterator;
import iterators.NameIterator;

import java.util.List;

public class NameRepository implements Container {
  private List<String> names;

  public NameRepository(List<String> names) {
    this.names = names;
  }

  public void addName(String name) {
    this.names.add(name);
  }

  public void addName(List<String> names) {
    this.names.addAll(names);
  }

  @Override
  public Iterator createIterator() {
    return new NameIterator(names);
  }
}
