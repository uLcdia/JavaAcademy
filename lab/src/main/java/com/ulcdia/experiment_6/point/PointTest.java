package com.ulcdia.experiment_6.point;

public class PointTest {
    public static void main(String[] args) {
        try {
            Point point1 = new Point(1, 2);
            Point point2 = point1.clone();
            System.out.println("point1: " + point1);
            System.out.println("point2: " + point2);
            System.out.println("point1 == point2: " + (point1 == point2));
            System.out.println("point1.equals(point2): " + point1.equals(point2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
