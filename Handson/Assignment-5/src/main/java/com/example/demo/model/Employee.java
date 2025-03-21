package com.example.demo.model;

public class Employee {
	
	private String empId;
	private String empName;
	private String empEmail;
	private String location;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empId, String empName, String empEmail, String location) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.location = location;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
