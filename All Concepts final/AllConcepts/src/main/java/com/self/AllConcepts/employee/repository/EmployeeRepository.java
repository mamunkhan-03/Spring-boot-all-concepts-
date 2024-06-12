package com.self.AllConcepts.employee.repository;

import com.self.AllConcepts.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
