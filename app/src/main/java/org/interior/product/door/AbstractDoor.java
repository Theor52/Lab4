package org.interior.product.door;

public abstract class AbstractDoor implements IDoor {
    protected String color;
    protected String style;
    protected String lighting;
    protected String colorScheme;
    protected String furniturePlacing;
    protected boolean isOpen;

    public String getStyle() { return style; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getLighting() { return lighting; }
    public void setLighting(String lighting) { this.lighting = lighting; }
    public void open() {
        if (isOpen) {
            System.out.println("Door is already open");
            return;
        }
        isOpen = true;
        System.out.println("Door opened");
    }
    public void close() {
        if (!isOpen) {
            System.out.println("Door is already closed");
            return;
        }
        isOpen = false;
        System.out.println("Door closed");
    }
}