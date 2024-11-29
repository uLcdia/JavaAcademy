package com.ulcdia.experiment_5.decimal_to_binary;

public class DecimalToBinary {
    public static String toBinaryString(int i) {
        if (i == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();
        int bits = 32; // 32-bit int

        for (int bit = bits - 1; bit >= 0; bit--) {
            if ((i & (1 << bit)) == 0) {
                binaryString.append("0");
            } else {
                binaryString.append("1");
            }
        }

        // Trim leading zeros
        String result = binaryString.toString().replaceFirst("^0+(?!$)", "");

        return result.isEmpty() ? "0" : result;
    }

    public static String toBinaryStringAlt(int i) {
        if (i == 0) {
            return "0";
        }

        if (i < 0) {
            return toBinaryString(i);
        }

        StringBuilder binaryString = new StringBuilder();

        while (i > 0) {
            int remainder = i % 2;
            i /= 2;
            binaryString.insert(0, remainder);
        }

        return binaryString.toString();
    }
}
