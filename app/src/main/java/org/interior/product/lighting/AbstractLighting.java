package org.interior.product.lighting;


public abstract class AbstractLighting implements ILighting {
    protected String style;
    public String getStyle() {
        return this.style;
    }
    public void light() {
        System.out.println("Lighting up the room in " + this.style + " style");
    }
}