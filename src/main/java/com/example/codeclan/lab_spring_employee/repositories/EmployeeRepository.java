package com.example.codeclan.lab_spring_employee.repositories;

import com.example.codeclan.lab_spring_employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
