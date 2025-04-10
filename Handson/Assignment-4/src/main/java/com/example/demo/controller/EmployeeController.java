package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.EmployeeService;
import com.example.demo.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping("/index")
	public ModelAndView firstPage() {
		return new ModelAndView("index");
	}
	 
	@RequestMapping(value = "addNewEmployee", method = RequestMethod.POST)
	public ModelAndView processRequest(Employee emp) {
		
		employeeService.insertEmployee(emp);
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("employee", emp);
		return model;
	
	}

	@RequestMapping("/displayAll")
	public ModelAndView getEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		ModelAndView model = new ModelAndView("getEmployees");
		model.addObject("employees", employees);
		return model;
	}
	@RequestMapping("/display/{employee_id}")
	public ModelAndView getEmployeeByID(@PathVariable("employee_id")String empid)
	{
		Employee employee=employeeService.getEmployeeById(empid);
		ModelAndView model = new ModelAndView("getId");
		model.addObject("employee", employee);
		return model;
	}


}
