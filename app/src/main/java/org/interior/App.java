package org.interior;

import org.interior.factory.*;
import org.interior.product.arrangement.*;
import org.interior.product.chair.*;
import org.interior.product.colorscheme.*;
import org.interior.product.door.*;
import org.interior.product.lighting.*;
import org.interior.product.table.*;

public class App {
    public static void main(String[] args) {
        AbstractInteriorFactory[] factories = {
            new MinimalInteriorFactory(),
            new ModernInteriorFactory(),
            new ClassicInteriorFactory()
        };

        for (AbstractInteriorFactory factory : factories) {
            IChair chair = factory.createChair();
            ITable table = factory.createTable();
            IDoor door = factory.createDoor();
            ILighting lighting = factory.createLighting();
            IColorscheme colorscheme = factory.createColorscheme();
            IArrangement arrangement = factory.createArrangement();

            System.out.println("Factory: " + factory.getClass().getSimpleName());
            System.out.println(" Chair style: " + chair.getStyle());
            System.out.println(" Table style: " + table.getStyle());
            System.out.println(" Door style: " + door.getStyle());
            System.out.println(" Lighting style: " + lighting.getStyle());
            System.out.println(" Color scheme style: " + colorscheme.getStyle());
            System.out.println(" Arrangement style: " + arrangement.getStyle());
            System.out.println("--------------------------------");
            colorscheme.paintChair(chair);
            chair.sit();
            table.put("cup");
            table.put("plate");
            door.open();
        }
    }
}