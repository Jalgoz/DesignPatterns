package shapes;

import java.awt.*;

public class BaseShape implements Shape {
  private int x;
  private int y;
  private Color color;
  private boolean selected = false;

  public BaseShape(int x, int y, Color color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  @Override
  public int getX() {
    return this.x;
  }

  @Override
  public int getY() {
    return this.y;
  }

  @Override
  public int getWidth() {
    return 0;
  }

  @Override
  public int getHeight() {
    return 0;
  }

  @Override
  public void move(int x, int y) {
    this.x += x;
    this.y += y;
  }

  @Override
  public boolean isInsideBounds(int x, int y) {
    return this.x > getX() && this.x < (getX() + getWidth()) &&
        y > getY() && y < (getY() + getHeight());
  }

  @Override
  public void select() {
    this.selected = true;
  }

  @Override
  public void unselect() {
    this.selected = false;
  }

  @Override
  public boolean isSelected() {
    return this.selected;
  }

  @Override
  public void paint(Graphics graphics) {
    if (isSelected()) {
      enableSelectionStyle(graphics);
    } else {
      disableSelectionStyle(graphics);
    }
  }

  public void enableSelectionStyle(Graphics graphics) {
    graphics.setColor(Color.LIGHT_GRAY);

    Graphics2D g2 = (Graphics2D) graphics;
    float[] dash1 = { 2.0f };
    g2.setStroke(new BasicStroke(1.0f,
        BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_MITER,
        2.0f, dash1, 0.0f));
  }

  public void disableSelectionStyle(Graphics graphics) {
    graphics.setColor(color);
    Graphics2D g2 = (Graphics2D) graphics;
    g2.setStroke(new BasicStroke());
  }
}
