package org.interior.product.colorscheme;

import org.interior.product.chair.IChair;
import org.interior.product.door.IDoor;
import org.interior.product.table.ITable;

public abstract class AbstractColorscheme implements IColorscheme {
    protected String style;

    public String getStyle() { return style; }
    public void paintChair(IChair chair) {
        System.out.println("Chair painted with colorscheme: " + chair.getStyle());
        chair.setColor(style);
    }
    public void paintTable(ITable table) {
        System.out.println("Table painted with colorscheme: " + table.getStyle());
        table.setColor(style);
    }
    public void paintDoor(IDoor door) {
        System.out.println("Door painted with colorscheme: " + door.getStyle());
        door.setColor(style);
    }
}