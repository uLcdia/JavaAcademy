package com.ulcdia.experiment_5.password_validator;

public class PasswordValidator {
    public static boolean validate(String password) {
        // It's better to use enum to indicate different types of violations

        if (password == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        if (password.length() < 8) {
            return false;
        }

        int numericCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isDigit(ch)) {
                numericCount++;
            }
        }

        return numericCount >= 2;
    }
}
