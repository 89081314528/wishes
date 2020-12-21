package ru.julia.wishes.service;

import ru.julia.wishes.dto.Person;

import java.util.List;

public interface EmployeeService {
    public List<Person> maxSalary();
    public Long nHighestSalary(int n);
}
