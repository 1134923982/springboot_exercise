package com.exercises.exercise.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String gerUserById(Integer id){
        System.out.println("get...");
        return "user";
    }

    public void deleteUserById(Integer id) {
        System.out.println("delete...");
    }
}
