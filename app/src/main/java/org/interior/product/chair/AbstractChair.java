package org.interior.product.chair;

public abstract class AbstractChair implements IChair {
    protected String color;
    protected String style;
    protected String lighting;
    protected String colorScheme;
    protected String furniturePlacing;

    public String getStyle() { return style; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getLighting() { return lighting; }
    public void setLighting(String lighting) { this.lighting = lighting; }
    public void sit() {
        System.out.println("Sitting on chair");
    }
}