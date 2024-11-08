package com.ulcdia.experiment_2.temperature;

public class Temperature {
    public static void main(String args[]) {
        int temperature = 38;
        if (temperature < 10) {
            System.out.println("Let Hell Freeze");
        } else if (temperature < 25) {
            System.out.println("Winter Is Coming");
        } else if (temperature < 35) {
            System.out.println("Endless Summer");
        } else {
            System.out.println("LIVE: Inferno");
        }
    }
}
