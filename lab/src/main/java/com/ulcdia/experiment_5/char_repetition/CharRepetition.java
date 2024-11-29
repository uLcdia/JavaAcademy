package com.ulcdia.experiment_5.char_repetition;

import java.util.Scanner;

public class CharRepetition {
    public static int count(String str, char a) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        return (int) str.chars()
                        .filter(c -> c == a)
                        .count();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String string = scanner.nextLine();

        System.out.print("Character: ");
        char ch = scanner.nextLine().charAt(0);
        
        scanner.close();

        System.out.println(count(string, ch) + " \'" + ch + "\' in \"" + string + "\"");
    }
}
