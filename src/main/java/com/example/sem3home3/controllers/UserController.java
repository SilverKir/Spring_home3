package com.example.sem3home3.controllers;

import com.example.sem3home3.domain.User;
import com.example.sem3home3.services.DataProcessingService;
import com.example.sem3home3.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RegistrationService registrationService;


    @GetMapping
    public List<User> getAllUsers(){
        return registrationService.getDataProcessingService().getAllUsers();
    }

    @PostMapping("/body")
    public String addUser(@RequestBody User user){
        registrationService.processRegistration(user.getName(), user.getAge(), user.getEmail());
     return "User "+ user.getName()+" added to list\n";
    }

}
