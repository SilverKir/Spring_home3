package com.example.sem3home3.repository;

import com.example.sem3home3.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

}
