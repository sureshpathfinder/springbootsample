package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Employee;
@Repository
public class EmployeeDAO {
	
	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
	 static {
	        initEmps();
	    }
	 
	    private static void initEmps() {
	        Employee emp1 = new Employee("E01", "Suganya","sugan@gmail.com","Chennai");
	        Employee emp2 = new Employee("E02", "priya","priya@gmail.com","Bangalore");
	        Employee emp3 = new Employee("E03", "Sruthi", "priya@gmail.com","Chennai");
	 
	        empMap.put(emp1.getEmpId(), emp1);
	        empMap.put(emp2.getEmpId(), emp2);
	        empMap.put(emp3.getEmpId(), emp3);
	    }
	    
	/*
	 * a. GET – using this the client should be able to get details of all
	 * registered employees and also be able to get employee details based on
	 * Employee ID which can be passed as a Path Parameter
	 */
	    public Employee getEmployee(String empNo) {
	        return empMap.get(empNo);
	    }
	    
	    public List<Employee> getAllEmployees() {
	        Collection<Employee> c = empMap.values();
	        List<Employee> list = new ArrayList<Employee>();
	        list.addAll(c);
	        return list;
	    }
	    
	/*
	 * b. POST – using this method the client should be able to save an Employees
	 * details into the Map
	 */
	    public Employee addEmployee(Employee emp) {
	        empMap.put(emp.getEmpId(), emp);
	        return emp;
	    }

	/*
	 * c. PUT – using this method the client should be able to update/modify the
	 * Employees details except for Employee ID
	 */
	    public Employee updateEmployee(Employee emp) {
	        empMap.put(emp.getEmpId(), emp);
	        return emp;
	    }
	/*
	 * d. DELETE – using this method the client should be able to delete an unwanted
	 * Employee record
	 */
	    public void deleteEmployee(String empNo) {
	        empMap.remove(empNo);
	    }
}
