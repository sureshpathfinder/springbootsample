package com.example.cachedemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.cachedemo.model.Users;
import com.example.cachedemo.repo.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepository;

    // Get product by ID (Cacheable)
    @Cacheable(value = "users", key = "#id")
    public Users getUsersById(Long id) {
        System.out.println("Fetching from DB...");
        return userRepository.findById(id).orElse(null);
    }

    // Save/Update product (CachePut)
    @CachePut(value = "products", key = "#product.id")
    public Users saveOrUpdate(Users product) {
        return userRepository.save(product);
    }

    // Remove from cache (CacheEvict)
    @CacheEvict(value = "products", key = "#id")
    public void deleteProduct(Long id) {
        userRepository.deleteById(id);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<Users> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<Users> findAllUsers(String name, String designation) {
        return userRepository.findUsersByNameAndStatus(name, designation);
    }
}

