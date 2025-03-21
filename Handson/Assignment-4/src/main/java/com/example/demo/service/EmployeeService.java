package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;
public interface EmployeeService {
	void insertEmployee(Employee emp);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empid);

}
