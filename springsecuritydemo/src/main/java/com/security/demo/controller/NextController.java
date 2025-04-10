package com.security.demo.controller;

import com.security.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/next")
public class NextController {
    @GetMapping("/test")
    String getDemo(){
        return "Welcome to spring application with skjecurity";
    }

    private final MyService myService;

    public NextController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/fetch")
    public String fetchData() {
        return myService.fetchData();
    }
}
