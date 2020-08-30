package com.example.app.controller;


import com.example.app.model.User;
import com.example.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUser(){
        return this.userRepository.findAll();
    }

}
