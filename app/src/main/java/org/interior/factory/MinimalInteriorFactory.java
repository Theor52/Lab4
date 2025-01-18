package org.interior.factory;

import org.interior.product.arrangement.*;
import org.interior.product.chair.*;
import org.interior.product.colorscheme.*;
import org.interior.product.door.*;
import org.interior.product.lighting.*;
import org.interior.product.table.*;

public class MinimalInteriorFactory implements AbstractInteriorFactory {
    public IChair createChair() { return new MinimalChair(); }
    public ITable createTable() { return new MinimalTable(); }
    public IDoor createDoor() { return new MinimalDoor(); }
    public ILighting createLighting() { return new MinimalLighting(); }
    public IColorscheme createColorscheme() { return new MinimalColorscheme(); }
    public IArrangement createArrangement() { return new MinimalArrangement(); }
}
