package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ServicesProcess;

@Controller
@RequestMapping("/process")
public class ControllerProcess {

    private final ServicesProcess process;

    public ControllerProcess (ServicesProcess process){
        this.process = process;
    }

    /*@GetMapping
    public String list(org.springframework.ui.Model model){
        model.addAttribute("list", process.getAll());
        return "process";
    }*/
}
