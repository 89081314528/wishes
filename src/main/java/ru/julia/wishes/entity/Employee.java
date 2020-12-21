package ru.julia.wishes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Column(name = "id")
    @Id
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "salary")
    Long salary;
    @Column(name = "department_id")
    Long departmentId;

    public Employee(int i, String joe, int i1, int i2) {
        this.id = (long) i;
        this.name = joe;
        this.salary = (long) i1;
        this.departmentId = (long) i2;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Employee(Long id, String name, Long salary, Long departmentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
    }
    public Employee() {
    }

}
