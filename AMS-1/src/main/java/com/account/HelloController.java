package com.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/index")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	
	@PostMapping("/testPost")
	public String testPost() {
		return "Greetings from Spring Boot!";
	}
	
	@PostMapping("/joinName")
	public String joinName(String firstName, String lastName) {
		return firstName + " " +lastName;
	}
	
	
}