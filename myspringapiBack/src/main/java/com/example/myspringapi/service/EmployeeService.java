package com.example.myspringapi.service;

import com.example.myspringapi.repository.EmployeeRepository;
import com.example.myspringapi.model.Employee;
import com.example.myspringapi.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService implements IEmployeeService {
    private final EmployeeRepository employeeRepository;
    private final PatronRepository patronRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, PatronRepository patronRepository) {
        this.employeeRepository = employeeRepository;
        this.patronRepository = patronRepository;
    }


    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }


    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }



//    @Override
//    public void createEmployee(Employee employee) {
//        employeeRepository.save(employee);
//    }


//    @Override
//    public void createPatron(Patron patron, Long employeurId) {
//        Employeur employeur = employeurRepository.findById(employeurId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employeur with id " + employeurId + " not found"));
//        patron.setEmployeur(employeur);
//        patronRepository.save(patron);
//    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("Employee with id %s doesn't exist", id)));
        employeeToUpdate.setFirstName(employee.getFirstName());
        employeeToUpdate.setLastName(employee.getLastName());
        employeeToUpdate.setAge(employee.getAge());
        employeeToUpdate.setEmailAddress(employee.getEmailAddress());
        employeeToUpdate.setAddress(employee.getAddress());
        employeeToUpdate.setRole(employee.getRole());

        employeeRepository.save(employeeToUpdate);
        return employeeToUpdate;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.findById(id).ifPresent(employeeRepository::delete);
    }



}
