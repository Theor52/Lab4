package org.interior.product.arrangement;


public abstract class AbstractArrangement implements IArrangement {
    protected String style;
    public String getStyle() {
        return this.style;
    }
    public void arrange() {
        System.out.println("Arranging " + this.style + " arrangement");
    }
}