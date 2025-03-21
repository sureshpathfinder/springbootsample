package com.example.demo.model;

public class Employee{
	
	public String employee_id;
	public String employee_name;
	public String employee_email;
	public String location;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employee_id, String employee_name, String employee_email, String location) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_email = employee_email;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_email="
				+ employee_email + ", location=" + location + "]";
	}

	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
