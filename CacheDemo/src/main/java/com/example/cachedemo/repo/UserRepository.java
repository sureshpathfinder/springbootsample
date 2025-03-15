package com.example.cachedemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.cachedemo.model.Users;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom query methods can be added here

    @Query(value = "SELECT * FROM users WHERE name = ?1 AND email = ?2", nativeQuery = true)
    List<Users> findUsersByNameAndStatus(String name, String email);
}

