package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.User;
import com.example.demo.service.ServicesUsers;

@Controller
@RequestMapping("/user")
public class ControllerUsers {
    private final ServicesUsers service;

    public ControllerUsers (ServicesUsers service){
        this.service = service;
    }

    @GetMapping
    public String getAll(Model model){
        List<User> lista =  service.getAll();

        model.addAttribute("users", lista);

        return "user";
    }

    @GetMapping("{id}")
    public String profile(@PathVariable("id") Long id, Model model){
        User user = service.getUserById(id);

        List<ProcessAction> lista = service.getProcessByUser(id);

        model.addAttribute("user", user);

        model.addAttribute("listaProcessos", lista);

        return "user-id";
    }  
}