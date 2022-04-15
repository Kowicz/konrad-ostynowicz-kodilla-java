package com.kodilla.testing.shape;

import java.util.Objects;

public class Disk implements Shape{
    private final String shapeName = "disk";
    private double diameter;

    public Disk(double diameter) throws IllegalArgumentException {
        if (diameter <= 0) {
            throw new IllegalArgumentException("Diameter have to be larger than 0.");
        } else {
            this.diameter = diameter;
        }
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getArea() {
        return Math.PI * this.diameter * this.diameter;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Disk disk = (Disk) object;
        return this.getDiameter() == disk.getDiameter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiameter());
    }
}
