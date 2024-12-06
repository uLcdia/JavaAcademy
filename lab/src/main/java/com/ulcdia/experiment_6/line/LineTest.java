package com.ulcdia.experiment_6.line;

public class LineTest {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        Line line2 = new Line(new Point(1, 2), new Point(10, 14));
        System.out.println("line1: " + line1);
        System.out.println("line2: " + line2);
        System.out.println("line1.length: " + line1.length());
        System.out.println("line2.length: " + line2.length());
        System.out.println("line1.setLine(line2)");
        line1.setLine(line2);
        System.out.println("line1: " + line1);
        System.out.println("line1.length: " + line1.length());
    }
}
