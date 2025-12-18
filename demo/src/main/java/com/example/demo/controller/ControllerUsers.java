package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.service.ServicesUsers;

@Controller
@RequestMapping("/user")
public class ControllerUsers {
    private final ServicesUsers user;

    public ControllerUsers (ServicesUsers user){
        this.user = user;
    }

    @GetMapping
    public String getAll(Model model){
        List<User> lista =  user.getAll();

        model.addAttribute("users", lista);

        return "user";
    }
}
