package org.example;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private String licensePlate;
    private int maxSeats;
    private Set<Employee> passengers;

    public Car(String licensePlate, int maxSeats) {
        this.licensePlate = licensePlate;
        this.maxSeats = maxSeats;
        this.passengers = new HashSet<>();
    }

    public void addPassenger(Employee employee) {
        if (passengers.size() < maxSeats) {
            passengers.add(employee);
        } else {
            throw new IllegalStateException("Car is full");
        }
    }

    public Set<Employee> getPassengers() {
        return passengers;
    }

    public boolean isDrivable() {
        return passengers.stream().anyMatch(emp -> emp instanceof Driver) && passengers.size() <= maxSeats;
    }

    public boolean isHappy() {
        for (Employee passenger : passengers) {
            for (Employee otherPassenger : passengers) {
                if (passenger.wantsToAvoid(otherPassenger)) {
                    return false;
                }
            }
        }
        return true;
    }
}
