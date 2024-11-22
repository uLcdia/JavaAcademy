package com.ulcdia.experiment_4.quadratic_equation;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;
    private final double discriminant;

    // Constructor
    public QuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' must not be zero for a quadratic equation.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = calculateDiscriminant(a, b, c);
    }
    
    // Getters
    public double getA() {
        return this.a;
    }
    
    public double getB() {
        return this.b;
    }
    
    public double getC() {
        return this.c;
    }

    // Main
    public double[] calculateRoots() {
        if (this.discriminant > 0) {
            double root1 = (-this.b + Math.sqrt(this.discriminant)) / (2 * this.a);
            double root2 = (-this.b - Math.sqrt(this.discriminant)) / (2 * this.a);
            return new double[]{root1, root2};
        } else if (this.discriminant == 0) {
            double root = -this.b / (2 * this.a);
            return new double[]{root};
        } else {
            return new double[0];
        }
    }

    private static double calculateDiscriminant(double a, double b, double c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }
}