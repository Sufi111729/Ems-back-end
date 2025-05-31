package com.jsp.springboot.ems.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.ems.entity.Employee;
import com.jsp.springboot.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employees = repository.findAll();
        if (employees.isEmpty()) {
            return Collections.emptyList();  // Return empty list, not null
        } else {
            return employees;
        }
    }

    @Override
    public Employee findByEmployeeId(int id) {
        Optional<Employee> optional = repository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Employee updateById(int id, Employee updatedEmployee) {
        Optional<Employee> optional = repository.findById(id);
        if (optional.isEmpty()) {
            return null;
        } else {
            Employee existingEmployee = optional.get();
            updatedEmployee.setId(existingEmployee.getId());
            return repository.save(updatedEmployee);
        }
    }

    @Override
    public Employee deleteByEmployeeId(int id) {
        Optional<Employee> optional = repository.findById(id);
        if (optional.isPresent()) {
            Employee existingEmployee = optional.get();
            repository.deleteById(id);
            return existingEmployee;
        } else {
            return null;
        }
    }

    @Override
    public List<Employee> deleteAll() {
        List<Employee> allEmployees = repository.findAll();
        if (!allEmployees.isEmpty()) {
            repository.deleteAll();
            return allEmployees;
        } else {
            return Collections.emptyList();
        }
    }
}
