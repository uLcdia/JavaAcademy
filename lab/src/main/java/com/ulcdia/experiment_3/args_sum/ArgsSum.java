package com.ulcdia.experiment_3.args_sum;

public class ArgsSum {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println(sum);
    }
}
