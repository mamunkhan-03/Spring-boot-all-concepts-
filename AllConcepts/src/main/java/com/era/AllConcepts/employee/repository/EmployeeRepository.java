package com.era.AllConcepts.employee.repository;

import com.era.AllConcepts.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
