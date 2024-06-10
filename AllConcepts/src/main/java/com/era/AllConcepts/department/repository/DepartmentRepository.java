package com.era.AllConcepts.department.repository;

import com.era.AllConcepts.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
