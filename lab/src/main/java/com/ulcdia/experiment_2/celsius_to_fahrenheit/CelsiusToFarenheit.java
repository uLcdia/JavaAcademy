package com.ulcdia.experiment_2.celsius_to_fahrenheit;

import java.util.stream.IntStream;

public class CelsiusToFarenheit {
    public static void main(String args[]) {
        System.out.println("Celsius\tFarenheit");
        IntStream.rangeClosed(0, 40)
            .filter(c -> c % 5 == 0)
            .forEach(c -> System.out.println(c + "\t" + (c * 9.0/5.0 + 32)));
    }
}
