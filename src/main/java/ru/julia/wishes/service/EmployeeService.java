package ru.julia.wishes.service;

import ru.julia.wishes.controllers.Person;
import ru.julia.wishes.dto.WishDto;

import java.util.List;

public interface EmployeeService {
    public List<Person> maxSalary();
}
