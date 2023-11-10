import model.User;
import proxy.DatabaseProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Email: ");
    String email = reader.readLine();

    System.out.print("Password: ");
    String password = reader.readLine();

    DatabaseProxy proxy = new DatabaseProxy(new User(email, password));
    proxy.request();
  }
}