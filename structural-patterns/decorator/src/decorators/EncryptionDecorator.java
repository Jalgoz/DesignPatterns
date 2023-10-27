package decorators;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {
  /**
   * Constructor to create a DataSourceDecorator with a wrapped DataSource object.
   *
   * @param dataSource The DataSource object to be wrapped and extended.
   */
  public EncryptionDecorator(DataSource dataSource) {
    super(dataSource);
  }

  /**
   * Encodes a given string by first converting it to a byte array and then
   * incrementing each byte's value by 1 before converting the result to Base64.
   *
   * @param data The input string to be encoded.
   * @return A Base64-encoded string after incrementing each byte by 1.
   */
  private String encode(String data) {
    byte[] result = data.getBytes();
    for (int i = 0; i < result.length; i++) {
      result[i] += (byte) 1;
    }

    return Base64.getEncoder().encodeToString(result);
  }

  /**
   * Decodes a given Base64-encoded string by first decoding it to a byte array
   * and then decrementing each byte's value by 1 before converting the result to a string.
   *
   * @param data The Base64-encoded string to be decoded.
   * @return The original string after decrementing each byte by 1.
   */
  private String decode(String data) {
    byte[] result = Base64.getDecoder().decode(data);
    for (int i = 0; i < result.length; i++) {
      result[i] -= (byte) 1;
    }

    return new String(result);
  }

  @Override
  public void writeData(String data) {
    super.writeData(encode(data));
  }

  @Override
  public String readData() {
    return decode(super.readData());
  }
}
