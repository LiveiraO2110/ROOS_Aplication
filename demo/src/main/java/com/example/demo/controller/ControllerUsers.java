package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ServicesUsers;

@Controller
@RequestMapping("/user")
public class ControllerUsers {
    private final ServicesUsers user;

    public ControllerUsers (ServicesUsers user){
        this.user = user;
    }

    @GetMapping
    public String list (org.springframework.ui.Model model){
        model.addAttribute("list", user.getAll());
        return "user";
    }
}
