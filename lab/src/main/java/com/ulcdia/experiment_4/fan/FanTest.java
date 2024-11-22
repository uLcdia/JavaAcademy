package com.ulcdia.experiment_4.fan;

public class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FanSpeed.HIGH);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(FanSpeed.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2);
    }
}
