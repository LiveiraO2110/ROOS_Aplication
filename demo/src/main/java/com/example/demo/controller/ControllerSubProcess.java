package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.SubProcessAction;
import com.example.demo.service.ServicesSubProcess;

@Controller
@RequestMapping("/process/sub-process")
public class ControllerSubProcess {
    private final ServicesSubProcess service;

    public ControllerSubProcess(ServicesSubProcess service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public String getAll(@PathVariable("id") Long id, Model model){
        List<SubProcessAction> lista = service.getAll(id);
        
        model.addAttribute("subProcessos", lista);

        return "sub_process";
    }
}
