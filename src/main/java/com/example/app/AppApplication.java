package com.example.app;

import com.example.app.model.User;
import com.example.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }


    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Alex","alex@alex.com"));
    }
}
