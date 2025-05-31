package com.jsp.springboot.ems.services;

import java.util.List;

import com.jsp.springboot.ems.entity.Employee;

public interface EmployeeServices {

	Employee addEmployee(Employee employee);

	List<Employee> findAllEmployee();

	Employee findByEmployeeId(int id);

	Employee updateById(int id, Employee updateEmployee);

	Employee deleteByEmployeeId(int id);

	List<Employee> deleteAll();


}