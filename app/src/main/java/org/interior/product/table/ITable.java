package org.interior.product.table;

public interface ITable {
    public String getStyle();
    public String getColor();
    public void setColor(String color);
    public void put(String item);
    public void remove(String item);
}
