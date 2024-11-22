package com.ulcdia.experiment_4.regular_polygon;

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("RegularPolygon1: ");
        print(regularPolygon1);

        System.out.println("");
        System.out.println("RegularPolygon2: ");
        print(regularPolygon2);

        System.out.println("");
        System.out.println("RegularPolygon3: ");
        print(regularPolygon3);
    }

    private static void print(RegularPolygon regularPolygon) {
        System.out.println("Perimeter: " + regularPolygon.getPerimeter());
        System.out.println("Area: " + regularPolygon.getArea());
    }
}
