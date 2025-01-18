package org.interior.factory;

import org.interior.product.arrangement.IArrangement;
import org.interior.product.chair.IChair;
import org.interior.product.colorscheme.IColorscheme;
import org.interior.product.door.IDoor;
import org.interior.product.lighting.ILighting;
import org.interior.product.table.ITable;

public interface AbstractInteriorFactory {
    public IChair createChair();
    public ITable createTable();
    public IDoor createDoor();
    public ILighting createLighting();
    public IColorscheme createColorscheme();
    public IArrangement createArrangement();
}