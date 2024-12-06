package com.ulcdia.experiment_6.line;

// Another Point class, for testing inheritance
public class Point {
    // (x, y) coordinate for the point
    protected double x;
    protected double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public Point() {
        this(0, 0);
    }

    public void setPoint(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
