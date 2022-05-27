package com.example.service;

import com.example.domain.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> getEmployeesLagerThan(int threshold);

    Map<Integer, List<Employee>> getEmployees();
}
