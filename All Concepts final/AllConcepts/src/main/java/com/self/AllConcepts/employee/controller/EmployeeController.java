package com.self.AllConcepts.employee.controller;

import com.self.AllConcepts.employee.dto.EmployeeDto;
import com.self.AllConcepts.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/employees")
@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto employeeResponse = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(employeeResponse, HttpStatus.CREATED);
    }

    @GetMapping("")
    public List<EmployeeDto> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee (@RequestBody EmployeeDto employeeDto, @PathVariable (name = "id") Long id){
        EmployeeDto responseDto=employeeService.updateEmployee(employeeDto, id);

        return new ResponseEntity<>(responseDto,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EmployeeDto> deleteEmployee (@PathVariable (name="id")Long id ){
        EmployeeDto employeeResponse  =employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeePatch (@RequestBody EmployeeDto employeeDto, @PathVariable (name = "id") Long id){
        EmployeeDto responseDto=employeeService.updateEmployeePatch(employeeDto, id);

        return new ResponseEntity<>(responseDto,HttpStatus.OK);
    }


}
