package ru.julia.wishes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.wishes.dto.WishDto;
import ru.julia.wishes.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @RequestMapping("/777")
    public List<Person> maxSalary() {
        return employeeService.maxSalary();
    }


}
