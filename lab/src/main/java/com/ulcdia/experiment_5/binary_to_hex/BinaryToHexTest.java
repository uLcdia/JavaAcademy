package com.ulcdia.experiment_5.binary_to_hex;

public class BinaryToHexTest {
    public static void main(String[] args) {
        /*
        // It’s almost always a better idea to use built-in functions.

        int decimalInt = 17;
        String binaryString = Integer.toBinaryString(decimalInt);
        System.out.println("Decimal: " + decimalInt);
        System.out.println("Binary: " + binaryString);

        decimalInt = Integer.parseInt(binaryString, 2);
        String hexadecimalString = Integer.toHexString(decimalInt);
        System.out.println("Hexadecimal: " + hexadecimalString);
        */

        String[] binaryStrings = {
            "1101",
            "101010",
            "11111111",
            "1000",
            "00000000",
            "1010101010",
            "11001001100110",
            "0",
            "1"
        };

        System.out.printf("%-15s %-15s %-15s%n", "Binary", "Hex (custom)", "Hex (built-in)");

        for (String binaryString : binaryStrings) {
            String hexCustom = BinaryToHex.toHexString(binaryString);
            String hexBuiltIn = Integer.toHexString(Integer.parseInt(binaryString, 2));
            System.out.printf("%-15s %-15s %-15s%n", binaryString, hexCustom, hexBuiltIn);
        }
    }
}
