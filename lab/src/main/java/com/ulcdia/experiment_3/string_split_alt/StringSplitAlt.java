package com.ulcdia.experiment_3.string_split_alt;

import java.util.Arrays;

public class StringSplitAlt {
    public static void main(String[] args) {
        String string = "  1   3   5\n" +
                        "  2   4   6   8\n" +
                        "  1   9   16  25   36\n" +
                        "  10  20  30\n" +
                        "  1   2   3   4   5    6";
        int[][] result = Arrays.stream(string.split("\n")) // row: split by '\n'
                .map(row -> Arrays.stream(row.split("\\s+")) // col: split by whitespace
                                  .filter(s -> !s.isEmpty()) // Filter out empty strings
                                  .map(String::trim) // Trim whitespace
                                  .mapToInt(Integer::parseInt) // Convert to int
                                  .toArray()) // Collect to array
                .toArray(int[][]::new); // Convert to int[][]
        System.out.println(Arrays.deepToString(result));
    }
}
