package com.jsp.springboot.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jsp.springboot.ems.entity.Employee;
import com.jsp.springboot.ems.services.EmployeeServices;
import com.jsp.springboot.ems.utility.ResponseStructure;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")  // Allow all origins; adjust for production if needed
public class EmployeeController {

    @Autowired
    private EmployeeServices service;

    @PostMapping
    public ResponseEntity<ResponseStructure<Employee>> addEmployee(@RequestBody Employee employee) {
        Employee employee2 = service.addEmployee(employee);

        ResponseStructure<Employee> rs = new ResponseStructure<>();
        rs.setStatuscode(HttpStatus.CREATED.value());
        rs.setMessage("Employee object created successfully");
        rs.setData(employee2);

        return new ResponseEntity<>(rs, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ResponseStructure<List<Employee>>> findAllEmployee() {
        List<Employee> employees = service.findAllEmployee();

        ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
        rs.setStatuscode(HttpStatus.OK.value());
        rs.setMessage(employees == null || employees.isEmpty() 
            ? "No employees found" 
            : "Employee objects found successfully");
        rs.setData(employees);

        return new ResponseEntity<>(rs, HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<ResponseStructure<Employee>> findByEmployeeId(@RequestParam int id) {
        Employee employee2 = service.findByEmployeeId(id);

        ResponseStructure<Employee> rs = new ResponseStructure<>();
        if (employee2 == null) {
            rs.setStatuscode(HttpStatus.NOT_FOUND.value());
            rs.setMessage("Employee with id " + id + " not found");
            rs.setData(null);
            return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
        } else {
            rs.setStatuscode(HttpStatus.OK.value());
            rs.setMessage("Employee with id found successfully");
            rs.setData(employee2);
            return new ResponseEntity<>(rs, HttpStatus.OK);
        }
    }

    @PutMapping("/id")
    public ResponseEntity<ResponseStructure<Employee>> updateById(@RequestParam int id, @RequestBody Employee updatedEmployee) {
        Employee employee2 = service.updateById(id, updatedEmployee);

        ResponseStructure<Employee> rs = new ResponseStructure<>();
        if (employee2 == null) {
            rs.setStatuscode(HttpStatus.NOT_FOUND.value());
            rs.setMessage("Employee with id " + id + " not found for update");
            rs.setData(null);
            return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
        } else {
            rs.setStatuscode(HttpStatus.OK.value());
            rs.setMessage("Employee object updated successfully");
            rs.setData(employee2);
            return new ResponseEntity<>(rs, HttpStatus.OK);
        }
    }

    @DeleteMapping("/id")
    public ResponseEntity<ResponseStructure<Employee>> deleteByEmployeeId(@RequestParam int id) {
        Employee employee2 = service.deleteByEmployeeId(id);

        ResponseStructure<Employee> rs = new ResponseStructure<>();
        if (employee2 == null) {
            rs.setStatuscode(HttpStatus.NOT_FOUND.value());
            rs.setMessage("Employee with id " + id + " not found for deletion");
            rs.setData(null);
            return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
        } else {
            rs.setStatuscode(HttpStatus.OK.value());
            rs.setMessage("Employee with id deleted successfully");
            rs.setData(employee2);
            return new ResponseEntity<>(rs, HttpStatus.OK);
        }
    }

    @DeleteMapping("/all")
    public ResponseEntity<ResponseStructure<List<Employee>>> deleteAll() {
        List<Employee> employees = service.deleteAll();

        ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
        rs.setStatuscode(HttpStatus.OK.value());
        rs.setMessage("All employees deleted successfully");
        rs.setData(employees);

        return new ResponseEntity<>(rs, HttpStatus.OK);
    }
}
