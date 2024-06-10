package com.era.AllConcepts.employee.service;

import com.era.AllConcepts.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id);

    EmployeeDto updateEmployeePatch(EmployeeDto employeeDto, Long id);

    EmployeeDto deleteEmployeeById(Long id);

}
