package com.ulcdia.experiment_5.binary_to_hex;

public class BinaryToHex {
    private final static char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    public static String toHexString(String binaryString) {
        // Validation
        if (binaryString == null || binaryString.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        
        binaryString = binaryString.trim();
        if (!binaryString.matches("^[01]+$")) {
            throw new IllegalArgumentException("Input string is not a valid binary number: " + binaryString);
        }

        // Padding
        int paddingLength = (4 - (binaryString.length() % 4)) % 4;
        binaryString = String.format("%" + (binaryString.length() + paddingLength) + "s", binaryString)
                             .replace(' ', '0');

        // Conversion
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i += 4) {
            String chunk = binaryString.substring(i, i + 4);
            int hexValue = 0;

            /*
             * Bitwise conversion:
             * (hexValue << 1): 
             *  move int hexValue in binary one bit left
             *  equivalent to multiplying by 2
             * 
             * (chunk.charAt(j) - '0'):
             *  char/int:
             *   '0' = 48
             *   '0' - '0' = 0
             *   '1' - '0' = 1
             * 
             * |:
             *  bitwise OR
             *   0 | 0 = 0, 1 | 1 = 0
             *   0 | 1 = 1, 1 | 0 = 1
             *  
             */
            for (int j = 0; j < chunk.length(); j++) {
                hexValue = (hexValue << 1) | (chunk.charAt(j) - '0');
            }

            hexString.append(HEX_ARRAY[hexValue]);
        }
 
        return hexString.toString();
    }
}
