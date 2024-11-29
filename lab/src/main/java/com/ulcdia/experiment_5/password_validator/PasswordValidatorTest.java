package com.ulcdia.experiment_5.password_validator;

public class PasswordValidatorTest {
    public static void main(String[] args) {
        String[] passwordStrings = {
            "EjBMAo",
            "87cG0L",
            "ZoFgjbpk",
            "iZyAUuVRgX",
            "xHJyh29e9i",
            "w6RCU3dqKt",
            "Z#HOkF2ms0",
            "&kE6o@T5@j"
        };

        System.out.printf("%-12s %-12s%n", "Password", "Validation");

        for (String password : passwordStrings) {
            boolean validation = PasswordValidator.validate(password);
            System.out.printf("%-12s %-12s%n", password, validation);
        }
    }
}
