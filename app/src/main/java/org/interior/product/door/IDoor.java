package org.interior.product.door;

public interface IDoor {
    public String getStyle();
    public String getColor();
    public void setColor(String color);
    public void open();
    public void close();
}
