package db;

public class Database implements DatabaseAccess {
  @Override
  public void request() {
    System.out.println("Init DB....");
    System.out.println("Connection successfully");
  }
}
