package org.interior.factory;

import org.interior.product.arrangement.*;
import org.interior.product.chair.*;
import org.interior.product.colorscheme.*;
import org.interior.product.door.*;
import org.interior.product.lighting.*;
import org.interior.product.table.*;

public class ModernInteriorFactory implements AbstractInteriorFactory {
    public IChair createChair() { return new ModernChair(); }
    public ITable createTable() { return new ModernTable(); }
    public IDoor createDoor() { return new ModernDoor(); }
    public ILighting createLighting() { return new ModernLighting(); }
    public IColorscheme createColorscheme() { return new ModernColorscheme(); }
    public IArrangement createArrangement() { return new ModernArrangement(); }
}
