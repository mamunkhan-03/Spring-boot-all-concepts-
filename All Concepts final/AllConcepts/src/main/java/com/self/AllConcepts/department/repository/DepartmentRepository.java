package com.self.AllConcepts.department.repository;

import com.self.AllConcepts.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
