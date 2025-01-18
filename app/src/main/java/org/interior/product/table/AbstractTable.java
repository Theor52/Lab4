package org.interior.product.table;

import java.util.ArrayList;

public abstract class AbstractTable implements ITable {
    protected String color;
    protected String style;
    protected String lighting;
    protected ArrayList<String> items = new ArrayList<String>();

    public String getStyle() { return style; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getLighting() { return lighting; }
    public void setLighting(String lighting) { this.lighting = lighting; }
    public void put(String item) {
        items.add(item);
        System.out.println("Item added to table: " + item);
    }
    public void remove(String item) {
        if (!items.contains(item)) {
            System.out.println("Item not found on table: " + item);
            return;
        }
        items.remove(item);
        System.out.println("Item removed from table: " + item);
    }
}