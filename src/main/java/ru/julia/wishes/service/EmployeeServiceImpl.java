package ru.julia.wishes.service;

import org.springframework.stereotype.Service;
import ru.julia.wishes.dto.Person;
import ru.julia.wishes.dto.Salary;
import ru.julia.wishes.entity.Department;
import ru.julia.wishes.entity.Employee;
import ru.julia.wishes.repositories.DepartmentRepository;
import ru.julia.wishes.repositories.EmployeeRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Person> maxSalary() {
        List<Employee> employeeList = employeeRepository.findAll();
        List<Department> departmentList = departmentRepository.findAll();
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < departmentList.size(); i++) {
            Long currentDepartment = departmentList.get(i).getId();
            Long max = employeeList.get(0).getSalary();
            for (int j = 0; j < employeeList.size(); j++) {
                Employee employee = employeeList.get(j);
                if ((employee.getSalary() >= max) && (employee.getDepartmentId().equals(currentDepartment))) {
                    max = employee.getSalary();
                }
            }
            for (int j = 0; j < employeeList.size(); j++) {
                Employee employee = employeeList.get(j);
                if ((employee.getSalary().equals(max)) && (employee.getDepartmentId().equals(currentDepartment))) {
                    personList.add(new Person(departmentList.get(i).getName(),employee.getName(),employee.getSalary()));
                }
            }
        }
        return personList;
    }
    @Override
    public Long nHighestSalary(int n) {
        List<Employee> employeeList = employeeRepository.findAll();
        List<Long> salaries = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            salaries.add(employeeList.get(i).getSalary());
        }
        Collections.sort(salaries);
        for (int i = 0; i < salaries.size() - 1; i++) {
            if (salaries.get(i).equals(salaries.get(i + 1))) {
                salaries.remove(salaries.get(i));
                i = i - 1;
            }
        }
        return salaries.get(n - 1);
    }
}
