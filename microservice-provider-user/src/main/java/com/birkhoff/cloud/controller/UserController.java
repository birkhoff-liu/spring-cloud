package com.birkhoff.cloud.controller;

import com.birkhoff.cloud.entity.User;
import com.birkhoff.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
<<<<<<< HEAD
        Optional<User> optional = this.userRepository.findById(id);
        return optional.get();
=======
        User findOne = this.userRepository.getOne(id);
        return findOne;
>>>>>>> master
    }
}
