package com.ulcdia.experiment_4.car;

public class Car {
    private String ownerName;
    private double speed;    // in m/s
    private double steering; // in degree

    public Car(String ownerName) {
        this.ownerName = ownerName;
    }

    public Car(String ownerName, double speed, double steering) {
        this(ownerName);
        this.speed = speed;
        this.steering = steering;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getSteering() {
        return this.steering;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void stop() {
        this.speed = 0.0;
    }
}
