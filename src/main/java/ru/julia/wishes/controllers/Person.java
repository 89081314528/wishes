package ru.julia.wishes.controllers;

public class Person {
    private final String department;
    private final String name;
    private final Long salary;

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public Person(String department, String name, Long salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }
}
