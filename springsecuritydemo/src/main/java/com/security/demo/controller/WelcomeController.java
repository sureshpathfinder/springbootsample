package com.security.demo.controller;

import com.security.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
   private final MyService myService;

    public WelcomeController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/fetch")
    public String fetchData() {
        return myService.fetchData();
    }

    @GetMapping("/demo")
    String getDemo(){
        return "Welcome to spring application with security";
    }
}
