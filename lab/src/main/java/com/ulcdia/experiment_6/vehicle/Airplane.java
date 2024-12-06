package com.ulcdia.experiment_6.vehicle;

public class Airplane implements Vehicle {
    private double speed;

    @Override
    public void start() {
        System.out.println("Airplane started");
        speed = 0;
    }

    @Override
    public void stop() {
        System.out.println("Airplane stopped");
        speed = 0;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
        System.out.println("Airplane speed set to " + speed);
    }
}
