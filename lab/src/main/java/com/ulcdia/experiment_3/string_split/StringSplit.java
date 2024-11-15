package com.ulcdia.experiment_3.string_split;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String string = "23, 21.3, 33; 34, 2, 1.9, 2.1; 3, 3, 1, 3, 4, 4.9";
        double[][] result = Arrays.stream(string.split(";")) // row: split by ';'
                .map(row -> Arrays.stream(row.split(",")) // col: split by ','
                                  .map(String::trim) // Trim whitespace
                                  .mapToDouble(Double::parseDouble) // Convert to double
                                  .toArray()) // Collect to array
                .toArray(double[][]::new); // Convert to double[][]
        System.out.println(Arrays.deepToString(result));
    }
}
