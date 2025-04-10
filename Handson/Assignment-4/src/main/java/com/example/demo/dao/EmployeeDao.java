package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee emp);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);

}
