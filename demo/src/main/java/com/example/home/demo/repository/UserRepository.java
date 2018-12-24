package com.example.home.demo.repository;

import com.example.home.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //Provides us with the default methods to perform crude operation
    public Optional<User> findByLastName(String lastName);
}
