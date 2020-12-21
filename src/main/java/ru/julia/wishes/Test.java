package ru.julia.wishes;

import ru.julia.wishes.dto.Person;
import ru.julia.wishes.entity.Department;
import ru.julia.wishes.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        employeeList.add(new Employee(1,"Joe", 70000, 1));
        employeeList.add(new Employee(2,"Jim", 90000, 1));
        employeeList.add(new Employee(3,"Henry", 80000, 2));
        employeeList.add(new Employee(4,"Sam", 60000, 2));
        employeeList.add(new Employee(5,"Max", 90000, 1));
        departmentList.add(new Department(1,"IT"));
        departmentList.add(new Department(2,"Sales"));
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < departmentList.size(); i++) {
            Long currentDepartment = departmentList.get(i).getId();
//            System.out.println("currentDepartment = " + currentDepartment);
            Long max = employeeList.get(0).getSalary();
            for (int j = 0; j < employeeList.size(); j++) {
                Employee employee = employeeList.get(j);
                if (employee.getDepartmentId() == null) {
                    System.out.println("null");
                }
                if ((employee.getSalary()
                        >= max) &&
                        (employee.getDepartmentId()
                        .equals(currentDepartment))) {
                    max = employee.getSalary();
                }
            }
            for (int j = 0; j < employeeList.size(); j++) {
                Employee employee = employeeList.get(i);
                if ((employee.getSalary().equals(max)) && (employee.getDepartmentId().equals(currentDepartment))) {
                    personList.add(new Person(departmentList.get(i).getName(),employee.getName(),employee.getSalary()));
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(70000);
        list.add(80000);
        list.add(80000);
        list.add(80000);
        list.add(90000);
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
              list.remove(list.get(i));
              i = i - 1;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
