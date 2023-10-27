package decorators;

/**
 * The DataSourceDecorator class implements the DataSource interface and serves as a decorator
 * to add additional functionality to an existing DataSource object.
 */
public class DataSourceDecorator implements DataSource {
  private DataSource wrapper;

  /**
   * Constructor to create a DataSourceDecorator with a wrapped DataSource object.
   *
   * @param dataSource The DataSource object to be wrapped and extended.
   */
  public DataSourceDecorator(DataSource dataSource) {
    this.wrapper = dataSource;
  }

  @Override
  public void writeData(String data) {
    wrapper.writeData(data);
  }

  @Override
  public String readData() {
    return wrapper.readData();
  }
}
