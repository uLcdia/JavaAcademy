package com.ulcdia.experiment_6.vehicle;

public class Car implements Vehicle {
    private double speed;

    @Override
    public void start() {
        System.out.println("Car started");
        speed = 0;
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
        speed = 0;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
        System.out.println("Car speed set to " + speed);
    }
}
