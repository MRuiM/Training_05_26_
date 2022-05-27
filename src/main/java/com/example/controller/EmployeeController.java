package com.example.controller;

import com.example.domain.Employee;
import com.example.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;
    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/api", params = "age")
    public ResponseEntity<List<Employee>> getAllEmployeesLagerThan(@RequestParam int age) {
        return new ResponseEntity<>(employeeService.getEmployeesLagerThan(age), HttpStatus.OK);
    }

    @GetMapping( "/api")
    public ResponseEntity<Map<Integer, List<Employee>>> getAllColors() {
        try {
            return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleRuntimeException() {
        return new ResponseEntity("This is 404 response", HttpStatus.NOT_FOUND);
    }
}
