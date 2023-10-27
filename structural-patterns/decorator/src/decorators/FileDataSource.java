package decorators;

import java.io.*;

public class FileDataSource implements DataSource {
  private String name;

  public FileDataSource(String name) {
    this.name = name;
  }

  @Override
  public void writeData(String data) {
    // Create a File object to represent the file in the file system.
    File file = new File(name);
    // Create an output stream to write data to a file.
    try(OutputStream fos = new FileOutputStream(file)) {
      // Convert the 'data' string into a byte array and write it to the file.
      fos.write(data.getBytes(), 0, data.length());
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }

  @Override
  public String readData() {
    // Initialize a character array 'buffer' to store the read data.
    char[] buffer = null;
    // Create a File object to represent the file in the file system.
    File file = new File(name);
    // Create a read stream to read data from a file
    try (FileReader reader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      // Read data from the read stream into the provided character array.
      reader.read(buffer);
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }

    return new String(buffer);
  }
}
