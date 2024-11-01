package com.ulcdia.experiment_1.print_back;

import java.util.Scanner;

public class PrintBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        scanner.close();
    }
}
