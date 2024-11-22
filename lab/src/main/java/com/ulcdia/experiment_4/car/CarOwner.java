package com.ulcdia.experiment_4.car;

import java.util.ArrayList;

public class CarOwner {
    private String name;
    private ArrayList<Car> cars;

    public CarOwner(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

    public CarOwner(String name, ArrayList<Car> cars) {
        this(name);
        this.cars = cars;
    }

    public String getName() {
        return this.name;
    }

    public boolean addCar(Car car) {
        return this.cars.add(car);
    }

    public static void main(String[] args) {
        CarOwner brian = new CarOwner("Brian O'Conner");
        Car wrx = new Car(brian.getName(), 0.0, 1.0);

        brian.cars.add(wrx);

        brian.cars.get(0).setSpeed(50.0);
        System.out.println("2009 Subaru Impreza WRX STi GH: " + '\n' + 
                           "Owner: " + brian.cars.get(0).getOwnerName() + '\n' +
                           "Current speed (m/s): " + brian.cars.get(0).getSpeed() + '\n' +
                           "Current steering (degree): " + brian.cars.get(0).getSteering() + '\n');

        brian.cars.get(0).stop();
        System.out.println("2009 Subaru Impreza WRX STi GH: " + '\n' +
                           "Owner: " + brian.cars.get(0).getOwnerName() + '\n' +
                           "Current speed (m/s): " + brian.cars.get(0).getSpeed() + '\n' +
                           "Current steering (degree): " + brian.cars.get(0).getSteering() + '\n');
    }
}
