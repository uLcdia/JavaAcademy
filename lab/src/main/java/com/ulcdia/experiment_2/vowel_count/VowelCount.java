package com.ulcdia.experiment_2.vowel_count;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        scanner.close();
        Map<Character, Integer> vowelCount = new HashMap<>(
            Map.of('a', 0, 'e', 0, 'i', 0, 'o', 0, 'u', 0)
        );
        str.chars().forEach(c -> {
            if (vowelCount.containsKey((char) c)) {
                vowelCount.put((char) c, vowelCount.get((char) c) + 1);
            }
        });
        System.out.println(vowelCount);
    }
}
