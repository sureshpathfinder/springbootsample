package com.example.jpademo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpademo.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom query methods can be added here
}

