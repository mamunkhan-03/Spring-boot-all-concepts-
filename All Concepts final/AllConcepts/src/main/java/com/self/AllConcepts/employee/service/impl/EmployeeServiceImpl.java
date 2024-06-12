package com.self.AllConcepts.employee.service.impl;

import com.self.AllConcepts.employee.dto.EmployeeDto;
import com.self.AllConcepts.employee.entity.Employee;
import com.self.AllConcepts.employee.exception.ResourceNotFoundException;
import com.self.AllConcepts.employee.repository.EmployeeRepository;
import com.self.AllConcepts.employee.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private ModelMapper mapper;
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(ModelMapper mapper, EmployeeRepository employeeRepository) {
        this.mapper = mapper;
        this.employeeRepository = employeeRepository;
    }


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = mapToEntity(employeeDto);
        Employee employeeResponse = employeeRepository.save(employee);
        return mapToDto(employeeResponse);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();  //collect all the employees
        return employees.stream().map(employee -> mapToDto(employee)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id) {

        Employee employee= employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee", "id",id));

        updateEmployeeFields(employeeDto, employee);

        Employee employeeResponse =employeeRepository.save(employee);

        return mapToDto(employeeResponse);

    }

    @Override
    public EmployeeDto updateEmployeePatch(EmployeeDto employeeDto, Long id) {
        Employee employee= employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee", "id",id));

       updateEmployeeFields(employeeDto, employee);

        Employee employeeResponse =employeeRepository.save(employee);

        return mapToDto(employeeResponse);
    }

    @Override
    public EmployeeDto deleteEmployeeById(Long id) {

        Employee employee=employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee", "id",id));

        employeeRepository.deleteById(id);

        return mapToDto(employee);
    }

    private void updateEmployeeFields(EmployeeDto employeeDto, Employee employee) {
        employee.setEmpName(employeeDto.getEmpName());
        employee.setEmpAddress(employeeDto.getEmpAddress());
        employee.setEmpMail(employeeDto.getEmpMail());
        employee.setEmpMobile(employeeDto.getEmpMobile());
        employee.setEmpSalary(employeeDto.getEmpSalary());
        employee.setEmpDesignation(employeeDto.getEmpDesignation());
    }

    //map entity to dto
    public EmployeeDto mapToDto(Employee employee) {
        EmployeeDto employeeDto = mapper.map(employee, EmployeeDto.class);
        return employeeDto;
    }

    //map dto to entity
    public Employee mapToEntity(EmployeeDto employeeDto) {
        return mapper.map(employeeDto, Employee.class);

    }


}
