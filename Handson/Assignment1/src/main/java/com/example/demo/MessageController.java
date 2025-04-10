package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {
	
	@RequestMapping("/bank_name/{bank_name}")
	public String getBankName(@PathVariable("bank_name") String bank_name)
	{
		return "Welcome To "+bank_name ;
	}
	
	@RequestMapping("/bank_addr/{bank_addr}")
	public String getBankAddr(@PathVariable("bank_addr") String bank_addr)
	{
		return "Welcome To  HDFC "+bank_addr ;
	}
	
	 
	}


