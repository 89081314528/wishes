package ru.julia.wishes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.wishes.entity.Department;
import ru.julia.wishes.entity.Wish;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
