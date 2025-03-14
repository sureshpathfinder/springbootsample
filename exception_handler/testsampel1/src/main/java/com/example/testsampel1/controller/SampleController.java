package com.example.testsampel1.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestController
@RequestMapping("/user")
public class SampleController {
    @GetMapping("/{id}")
    public String hello(@PathVariable String id) {
        switch (id) {
            case "1":
                throw new HttpServerErrorException(HttpStatusCode.valueOf(500));
                case "2":
                    throw new HttpClientErrorException(HttpStatusCode.valueOf(400));
                case "3":
                    throw new RuntimeException("Client went wrong!");
            default:  return "Hellojhj World";
        }

    }
}
