package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private final String shapeName = "square";
    private double sideLength;

    public Square(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length have to be larger than 0.");
        } else {
            this.sideLength = sideLength;
        }
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getArea() {
        return this.sideLength * this.sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Square square = (Square) object;
        return this.getSideLength() == square.getSideLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getSideLength());
    }
}
