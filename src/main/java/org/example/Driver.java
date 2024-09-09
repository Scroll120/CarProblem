package org.example;

public class Driver extends Employee {
    private Car car;

    public Driver(String name, Car car) {
        super(name);
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
