package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int index) {
        if (!(index < 0 || index >= this.shapes.size())) {
            return this.shapes.get(index);
        }
        return null;
    }

    public String showFigures() {
        StringBuilder sb = new StringBuilder("");
        Iterator<Shape> iterator = shapes.iterator();

        while (iterator.hasNext()) {
            sb.append(iterator.next().getShapeName());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public int getShapesQuantity() {
        return shapes.size();
    }
}
