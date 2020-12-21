package ru.julia.wishes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.wishes.dto.Person;
import ru.julia.wishes.service.EmployeeService;

import java.util.List;
/**
 * Department Highest Salary
 */
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
    @RequestMapping("/departmentHighestSalary")
    public List<Person> maxSalary() {
        return employeeService.maxSalary();
    }

    @RequestMapping("/nHighestSalary/{n}")
    public Long nThSalary(@PathVariable int n) {
    return employeeService.nHighestSalary(n);
    }
}
