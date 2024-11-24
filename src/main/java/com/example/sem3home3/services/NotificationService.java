package com.example.sem3home3.services;

import com.example.sem3home3.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyUser(User user, String message){
        System.out.printf("User %s %s\n", user.getName(), message);
    }

}
