package com.ulcdia.experiment_6.line;

// NOT RECOMMENDED, FOR TESTING INHERITANCE ONLY
// Reason: Line IS NOT a Point, Line HAS 2 Points
public class Line extends Point {
    // NOT RECOMMENDED
    // Name conflict is by design
    private double x;
    private double y;

    public Line(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.x = x2;
        this.y = y2;
    }

    public Line(Point start, Point end) {
        super(start);
        this.x = end.x;
        this.y = end.y;
    }

    public Line() {
        this(0, 0, 0, 0);
    }

    public void setLine(Line sourceLine) {
        super.setPoint(sourceLine);
        this.x = sourceLine.x;
        this.y = sourceLine.y;
    }

    public double length() {
        return Math.sqrt(Math.pow(x - super.x, 2) + Math.pow(y - super.y, 2));
    }

    @Override
    public String toString() {
        return "Line{" + "start=" + super.toString() + ", end=" + "(" + x + ", " + y + ")" + '}';
    }
}
