package com.example.testsampel1;

import com.example.testsampel1.controller.TestSample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Testsampel1Application {

    public static void main(String[] args) {
        SpringApplication.run(Testsampel1Application.class, args);
        TestSample.test();
    }

}
