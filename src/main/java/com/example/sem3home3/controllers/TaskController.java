package com.example.sem3home3.controllers;

import com.example.sem3home3.domain.User;
import com.example.sem3home3.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    DataProcessingService dataProcessingService;

    @GetMapping
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        tasks.add("show");
        return tasks;
    }

    @GetMapping("/sort")
    public List<User> sort() {
        return dataProcessingService.sortUsersByAge(
                dataProcessingService.getAllUsers());
    }

    @GetMapping("/filter/{age}")
    public List<User> filter(@PathVariable("age") int age) {
        return dataProcessingService.filterUsersByAge(
                dataProcessingService.getAllUsers(), age);
    }

    @GetMapping("/calc")
    public double calc() {
        return dataProcessingService.calculateAverageAge(
                dataProcessingService.getAllUsers());
    }

    @GetMapping("/show")
    public List<User> show() {
        return dataProcessingService.getAllUsers();
    }

}
