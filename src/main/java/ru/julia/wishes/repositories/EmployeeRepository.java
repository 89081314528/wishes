package ru.julia.wishes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.wishes.entity.Employee;
import ru.julia.wishes.entity.Wish;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
