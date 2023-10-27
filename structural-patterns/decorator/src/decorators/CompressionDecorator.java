package decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
  private int compLevel = 6;

  /**
   * Constructor to create a DataSourceDecorator with a wrapped DataSource object.
   *
   * @param dataSource The DataSource object to be wrapped and extended.
   */
  public CompressionDecorator(DataSource dataSource) {
    super(dataSource);
  }

  public int getCompLevel() {
    return compLevel;
  }

  public void setCompLevel(int compLevel) {
    this.compLevel = compLevel;
  }

  /**
   * Compresses a string using Deflate compression algorithm and encodes it in Base64 format.
   *
   * @param stringData The input string to be compressed.
   * @return A Base64-encoded compressed string, or null if an IOException occurs.
   */
  private String compress(String stringData) {
    // Convert the input string to bytes
    byte[] data = stringData.getBytes();

    try {
      // Create a ByteArrayOutputStream to store the compressed data
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);

      // Create a DeflaterOutputStream with the specified compression level
      DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(compLevel));

      // Write the data to the DeflaterOutputStream
      deflaterOutputStream.write(data);

      // Close the DeflaterOutputStream and the ByteArrayOutputStream
      deflaterOutputStream.close();
      byteArrayOutputStream.close();

      // Encode the compressed data in Base64 and return it as a string
      return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
    } catch (IOException ex) {
      return null;
    }
  }

  /**
   * Decompresses a Base64-encoded string that was compressed using the Deflate algorithm.
   *
   * @param stringData The Base64-encoded string to be decompressed.
   * @return The decompressed string, or null if an IOException occurs.
   */
  private String decompress(String stringData) {
    // Decode the Base64-encoded string to obtain compressed data
    byte[] data = Base64.getDecoder().decode(stringData);

    try {
      // Create an InputStream from the compressed data
      InputStream inputStream = new ByteArrayInputStream(data);

      // Create an InflaterInputStream to decompress the data
      InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);

      // Create a ByteArrayOutputStream to store the decompressed data
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);

      int b;
      // Read and write the decompressed data byte by byte
      while ((b = inflaterInputStream.read()) != -1) {
        byteArrayOutputStream.write(b);
      }

      // Close the input and inflater streams, as well as the ByteArrayOutputStream
      inputStream.close();
      inflaterInputStream.close();
      byteArrayOutputStream.close();

      // Return the decompressed data as a string
      return byteArrayOutputStream.toString();
    } catch (IOException ex) {
      // If an IOException occurs during decompression, return null
      return null;
    }
  }

  @Override
  public void writeData(String data) {
    super.writeData(compress(data));
  }

  @Override
  public String readData() {
    return decompress(super.readData());
  }
}
