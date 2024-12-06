package com.ulcdia.experiment_6.vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.setSpeed(100);
        car.stop();

        System.out.println();
        Vehicle ship = new Ship();
        ship.start();
        ship.setSpeed(100);
        ship.stop();

        System.out.println();
        Vehicle aircraft = new Airplane();
        aircraft.start();
        aircraft.setSpeed(100);
        aircraft.stop();
    }
}
