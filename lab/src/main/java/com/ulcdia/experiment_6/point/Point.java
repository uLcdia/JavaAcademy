package com.ulcdia.experiment_6.point;

public class Point implements Cloneable {
    // (x, y) coordinate for the point
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point sourcePoint) {
        this(sourcePoint.x, sourcePoint.y);
    }

    @Override
    /* example 1
    protected Point clone() throws CloneNotSupportedException {
        return new Point(this);
    } */
    /* example 2 */
    protected Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
    /* example 3
    protected Point clone() throws CloneNotSupportedException {
        Point clonedPoint = new Point(this.x, this.y);
        return clonedPoint;
    } */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
