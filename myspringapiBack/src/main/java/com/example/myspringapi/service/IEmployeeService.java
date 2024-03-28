package com.example.myspringapi.service;

import com.example.myspringapi.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployees();


    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);

    void saveEmployee(Employee employee);
}
