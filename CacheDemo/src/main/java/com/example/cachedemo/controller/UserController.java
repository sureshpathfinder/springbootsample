package com.example.cachedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.cachedemo.model.Users;
import com.example.cachedemo.services.UserServices;

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

    @GetMapping("/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id) {
        return userServices.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/{name}/{designation}")
    public List<Users> findById(@PathVariable String name, @PathVariable String designation) {
        return userServices.findAllUsers(name, designation);
    }
}

