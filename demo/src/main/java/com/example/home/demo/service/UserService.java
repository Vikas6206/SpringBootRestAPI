package com.example.home.demo.service;

import com.example.home.demo.entity.User;
import com.example.home.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * This service is used to write the business logic to manupulate the data i.e. either coming
     * from the database or going to the database
     * Example: converting the time stamp from IST to BDT or vice versa while storing it in DB
     */

    public void setUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        throw new Exception("User not found");
    }

}
