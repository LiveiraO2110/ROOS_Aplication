package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.ProcessAction;
import com.example.demo.service.ServicesProcess;
import com.example.demo.service.ServicesUserProcess;

@Controller
@RequestMapping("/process")
public class ControllerProcess {
    private final ServicesProcess service;
    private final ServicesUserProcess service_user_process;

    public ControllerProcess(ServicesProcess service, ServicesUserProcess service_user_process) {
        this.service = service;
        this.service_user_process = service_user_process;
    }

    @GetMapping
    public String getAll(Model model){
        List<ProcessAction> lista = service.getAll();
        
        model.addAttribute("processos", lista);

        return "process";
    }
}