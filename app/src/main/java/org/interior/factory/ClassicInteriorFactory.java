package org.interior.factory;

import org.interior.product.arrangement.*;
import org.interior.product.chair.*;
import org.interior.product.colorscheme.*;
import org.interior.product.door.*;
import org.interior.product.lighting.*;
import org.interior.product.table.*;

public class ClassicInteriorFactory implements AbstractInteriorFactory {
    public IChair createChair() { return new ClassicChair(); }
    public ITable createTable() { return new ClassicTable(); }
    public IDoor createDoor() { return new ClassicDoor(); }
    public ILighting createLighting() { return new ClassicLighting(); }
    public IColorscheme createColorscheme() { return new ClassicColorscheme(); }
    public IArrangement createArrangement() { return new ClassicArrangement(); }
}
