package com.example.jpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.jpademo.model.Users;
import com.example.jpademo.services.UserServices;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private UserServices userServices;

    @GetMapping
    public List<Users> getAllUsers() {
        return userServices.getAllUsers();
    }

    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userServices.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userServices.deleteUser(id);
    }
}

