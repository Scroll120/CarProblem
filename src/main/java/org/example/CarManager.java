package org.example;

import java.util.HashSet;
import java.util.Set;

public class CarManager {
    private Set<Car> cars;
    private Set<Employee> employees;

    public CarManager(Set<Car> cars, Set<Employee> employees) {
        this.cars = cars;
        this.employees = employees;
    }

    public int countUnhappyCars() {
        int unhappyCount = 0;
        for (Car car : cars) {
            if (!car.isHappy()) {
                unhappyCount++;
            }
        }
        return unhappyCount;
    }

    public boolean canStartTheTrip() {
        for (Car car : cars) {
            if (!car.isDrivable()) {
                return false;
            }
        }

        Set<Employee> allPassengers = new HashSet<>();
        for (Car car : cars) {
            allPassengers.addAll(car.getPassengers());
        }

        return allPassengers.containsAll(employees);
    }
}
