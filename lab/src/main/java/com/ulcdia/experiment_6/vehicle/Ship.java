package com.ulcdia.experiment_6.vehicle;

public class Ship implements Vehicle {
    private double speed;

    @Override
    public void start() {
        System.out.println("Ship started");
        speed = 0;
    }

    @Override
    public void stop() {
        System.out.println("Ship stopped");
        speed = 0;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
        System.out.println("Ship speed set to " + speed);
    }
}
