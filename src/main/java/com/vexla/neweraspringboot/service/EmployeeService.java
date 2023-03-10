package com.vexla.neweraspringboot.service;

import com.vexla.neweraspringboot.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    List<Employee> getAllEmployees();

    Employee getEmployeeById(String employeeId);

    String deleteEmployeeById(String employeeId);
}
