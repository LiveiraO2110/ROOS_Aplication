package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ProcessAction;
import com.example.demo.service.ServicesProcess;

@Controller
@RequestMapping("/process")
public class ControllerProcess {
    private final ServicesProcess service;

    public ControllerProcess(ServicesProcess service) {
        this.service = service;
    }

    @GetMapping
    public String getAll(Model model){
        List<ProcessAction> lista = service.getAll();
        
        model.addAttribute("processos", lista);

        return "process";
    }
}