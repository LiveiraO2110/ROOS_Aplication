package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.ServicesUsers;

@RestController
@RequestMapping("/user")
public class ControllerUsers {
    private final ServicesUsers user;

    public ControllerUsers (ServicesUsers user){
        this.user = user;
    }

    @GetMapping
    public List<User> getAll(){
        return user.getAll();
    }
}
