package decorators;

import java.io.IOException;

/**
 * Common interface, it defines write and read operations
 *
 * @author Jose Lozada
 */
public interface DataSource {
  /**
   * Writes the provided data to a file with the specified name.
   *
   * @param data The data to be written to the file.
   * @throws IOException If an error occurs during the file writing process.
   */
  void writeData(String data);
  /**
   * Reads data from a file and returns it as a string.
   *
   * @return A string containing the data read from the file.
   * @throws IOException If an error occurs during the file reading process.
   */
  String readData();
}
