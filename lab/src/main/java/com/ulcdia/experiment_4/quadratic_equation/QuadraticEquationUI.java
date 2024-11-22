package com.ulcdia.experiment_4.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = getEquation(scanner);
        print(quadraticEquation);
    }

    private static QuadraticEquation getEquation(Scanner scanner) {
        double[] coefficients = new double[3];
        System.out.print("a: ");
        coefficients[0] = Double.parseDouble(scanner.nextLine());
        System.out.print("b: ");
        coefficients[1] = Double.parseDouble(scanner.nextLine());
        System.out.print("c: ");
        coefficients[2] = Double.parseDouble(scanner.nextLine());
        return new QuadraticEquation(coefficients[0], 
                                     coefficients[1], 
                                     coefficients[2]);
    }

    private static void print(QuadraticEquation quadraticEquation) {
        double[] roots = quadraticEquation.calculateRoots();
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("x_1 = x_2 = " + roots[0]);
        } else {
            System.out.println("x_1 = " + roots[0]);
            System.out.println("x_2 = " + roots[1]);
        }
    }
}
