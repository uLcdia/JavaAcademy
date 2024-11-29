package com.ulcdia.experiment_5.decimal_to_binary;

public class DecimalToBinaryTest {
    public static void main(String[] args) {
        int[] decimalInts = {
            0, 
            1, -1, 
            2, -2, 
            3, -3, 
            16, -16, 
            17, -17, 
            255, -255, 
            1024, -1024
        };

        System.out.printf("%-10s %-35s %-35s%n", "Decimal", "Binary (custom)", "Binary (built-in)");

        for (int i : decimalInts) {
            String customBinary = DecimalToBinary.toBinaryString(i);
            String builtInBinary = Integer.toBinaryString(i);
            System.out.printf("%-10d %-35s %-35s%n", i, customBinary, builtInBinary);
        }
    }
}
