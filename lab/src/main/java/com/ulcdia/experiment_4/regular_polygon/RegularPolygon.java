package com.ulcdia.experiment_4.regular_polygon;

public class RegularPolygon {
    private int sideCount = 3;
    private double sideLength = 1.0;
    private double corX = 0.0;
    private double corY = 0.0;

    // Constructors
    public RegularPolygon(int sideCount, double sideLength, double corX, double corY) {
        validatePositive(sideCount);
        validatePositive(sideLength);
        
        this.sideCount = sideCount;
        this.sideLength = sideLength;
        this.corX = corX;
        this.corY = corY;
    }

    public RegularPolygon() {
        this(3, 1.0, 0.0, 0.0);
    }

    public RegularPolygon(int sideCount, double sideLength) {
        this(sideCount, sideLength, 0.0, 0.0);
    }

    // Getters and setters
    public int getN() {
        return sideCount;
    }

    public void setN(int sideCount) {
        validatePositive(sideCount);
        this.sideCount = sideCount;
    }

    public double getSide() {
        return sideLength;
    }

    public void setSide(double sideLength) {
        validatePositive(sideLength);
        this.sideLength = sideLength;
    }

    public double getX() {
        return corX;
    }

    public void setX(double corX) {
        this.corX = corX;
    }

    public double getY() {
        return corY;
    }

    public void setY(double corY) {
        this.corY = corY;
    }

    // Main
    public double getPerimeter() {
        return this.getN() * this.getSide();
    }

    public double getArea() {
        return ((this.sideCount * Math.pow(this.sideLength, 2)) / 
                (4 * Math.tan(Math.PI / this.sideCount)));
    }

    // Validation
    private void validatePositive(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
    }

    private void validatePositive(double value) {
        if (value <= 0.0) {
            throw new IllegalArgumentException("Value must be positive");
        }
    }
}
