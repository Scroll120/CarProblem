package org.example;

import java.util.HashSet;
import java.util.Set;

public abstract class Employee {
    private String name;
    private Set<Employee> peopleToAvoid;

    public Employee(String name) {
        this.name = name;
        this.peopleToAvoid = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addPersonToAvoid(Employee person) {
        peopleToAvoid.add(person);
    }

    public boolean wantsToAvoid(Employee person) {
        return peopleToAvoid.contains(person);
    }
}
