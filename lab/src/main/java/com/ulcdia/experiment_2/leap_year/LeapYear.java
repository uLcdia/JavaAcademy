package com.ulcdia.experiment_2.leap_year;

import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntConsumer isLeapYear = (year) -> {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        };

        IntStream.range(0, 4).forEach(i -> isLeapYear.accept(scanner.nextInt()));

        scanner.close();
    }
}
