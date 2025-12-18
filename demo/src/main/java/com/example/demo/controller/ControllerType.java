package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.TypeProcess;
import com.example.demo.service.ServicesType;

@Controller
@RequestMapping("/type")
public class ControllerType {
    private final ServicesType service;

    public ControllerType(ServicesType service){
        this.service = service;
    }

    @GetMapping
    public String getAll(Model model){
        List<TypeProcess> lista = service.getAll();

        model.addAttribute("tipos", lista);

        return "type";
    }
}
