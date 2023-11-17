package iterators;

import entities.NameRepository;

import java.util.List;

public class NameIterator implements Iterator {
  private final List<String> names;
  private int position = 0;

  public NameIterator(List<String> names) {
    this.names = names;
  }

  @Override
  public boolean hastNext() {
    return position < names.size();
  }

  @Override
  public String next() {
    if (hastNext()) {
      return names.get(position++);
    }

    return null;
  }

  @Override
  public void reset() {
    this.position = 0;
  }
}
