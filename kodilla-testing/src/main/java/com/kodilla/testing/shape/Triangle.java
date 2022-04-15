package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private final String shapeName = "triangle";
    private double height;
    private double baseLength;

    public Triangle(double height, double baseLength) {
        if (height <= 0 || baseLength <= 0) {
            throw new IllegalArgumentException("Both height and base length have to be larger than 0.");
        } else {
            this.height = height;
            this.baseLength = baseLength;
        }
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getArea() {
        return 0.5 * this.height * this.baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) object;
        return this.getHeight() == triangle.getHeight() && this.getBaseLength() == triangle.getBaseLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getHeight(), this.getBaseLength());
    }
}
