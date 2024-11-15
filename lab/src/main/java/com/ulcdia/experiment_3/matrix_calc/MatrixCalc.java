package com.ulcdia.experiment_3.matrix_calc;

import java.util.ArrayList;

public class MatrixCalc {
    public static void main(String[] args) {
        ArrayList<Matrix> matrices = new ArrayList<>();
        matrices.add(new Matrix(new int[][] {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        }));
        matrices.add(new Matrix(new int[][] {
            { 2, 2, 2 },
            { 1, 1, 1 },
            { 3, 3, 3 }
        }));
        matrices.add(new Matrix(new int[][] {
            { 1, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 1 }
        }));

        System.out.println("Matrices:");
        matrices.forEach(System.out::println);

        System.out.println("Sum:");
        System.out.println(Matrix.sum(matrices));

        System.out.println("Multiply:");
        System.out.println(Matrix.multiply(matrices));
    }
}
