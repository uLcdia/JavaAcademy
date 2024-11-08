package com.ulcdia.experiment_2.expressions;

public class Expressions {
    public static void main(String args[]) {
        expression1();
        expression2();
    }

    private static void expression1() {
        int number1 = 3;
        int number2 = 4;
        int result = 20 * 8 / 4 + number1 + number2 * number1;
        System.out.println("Expression: (20 * 8 / 4 + number1 + number2 * number1) = " + result);
    }

    private static void expression2() {
        int number1 = 3;
        int number2 = 4;
        int result1 = number1 + number2;
        System.out.println("Outside the block: result1 = " + result1);
        {
            double result2;
            result2 = number2 + 4.5;
            number1++;
            System.out.println("Inside the block: result2 = " + result2);
            System.out.println("Inside the block: result1 = " + result1);
        }
        System.out.println("Outside the block: number1 = " + number1);
    }
}
