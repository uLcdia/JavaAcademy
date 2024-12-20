package com.ulcdia.experiment_8.complex;

public class ComplexTest {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1.0, 2.0);
        complex1.save("complex");

        Complex complex2 = Complex.load("complex");
        System.out.println("Complex number: " + complex2.getReal() + " + " + complex2.getImaginary() + "i");
    }
}
