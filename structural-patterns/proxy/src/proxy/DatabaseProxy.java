package proxy;

import db.Database;
import db.DatabaseAccess;
import model.User;

import java.util.HashMap;
import java.util.Map;

public class DatabaseProxy implements DatabaseAccess {
  private Database database;
  private final User user;

  private static final Map<String, String> DATA_BASE = new HashMap<>();

  static {
    DATA_BASE.put("jose@gmail.com", "12345678");
    DATA_BASE.put("esmeralda@gmail.com", "esmeralda");
  }

  public DatabaseProxy(User user) {
    this.user = user;
  }

  @Override
  public void request() {
    if (!user.getPassword().equals(DATA_BASE.get(user.getEmail()))) {
      System.out.println("You don't have access to the DB !!");

      return;
    }

    if (null == database) {
      database = new Database();
    }

    database.request();
  }
}
