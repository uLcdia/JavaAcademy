package com.ulcdia.experiment_4.fan;

public class Fan {
    private FanSpeed speed = FanSpeed.LOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    // Constructor
    public Fan() {
        this.speed = FanSpeed.LOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }
    
    // Getters and setters
    public FanSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(FanSpeed speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fan: ");
        if (this.isOn()) {
            stringBuilder.append("On" + '\n');
            stringBuilder.append("Speed: " + this.getSpeed() + '\n');
        } else {
            stringBuilder.append("Off" + '\n');
        }
        stringBuilder.append("Color: " + this.getColor() + '\n');
        stringBuilder.append("Radius: " + this.getRadius() + '\n');

        return stringBuilder.toString();
    }
}