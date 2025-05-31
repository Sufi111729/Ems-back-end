package com.jsp.springboot.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}