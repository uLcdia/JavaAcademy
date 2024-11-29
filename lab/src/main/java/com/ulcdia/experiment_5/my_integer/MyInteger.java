package com.ulcdia.experiment_5.my_integer;

public class MyInteger {
    private int number;

    public MyInteger(int number) {
        this.number = number;
    }

    public MyInteger() {
        this(0);
    }

    public int getNumber() {
        return this.number;
    }

    boolean isEven() {
        return (this.number % 2 == 0);
    }

    // Duplicate
    boolean isOdd() {
        return !(this.isEven());
    }

    boolean isPrime() {
        // {0,1}
        if (number <= 1) {
            return false;
        }

        // {2,3}
        if (number <= 3) {
            return true;
        }

        // {2n},{3n}
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        // {6n-1},{6n+1}
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        // Otherwise
        return true;
    }
}
