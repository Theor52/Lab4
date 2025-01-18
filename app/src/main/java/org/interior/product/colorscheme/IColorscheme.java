package org.interior.product.colorscheme;

import org.interior.product.chair.IChair;
import org.interior.product.door.IDoor;
import org.interior.product.table.ITable;

public interface IColorscheme {
    public String getStyle();
    public void paintChair(IChair chair);
    public void paintTable(ITable table);
    public void paintDoor(IDoor door);
}
