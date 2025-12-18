package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.SubProcessAction;
import com.example.demo.model.User;
import com.example.demo.service.ServicesSubProcess;
import com.example.demo.service.ServicesUsers;

@Controller
@RequestMapping("/process/sub-process")
public class ControllerSubProcess {
    private final ServicesSubProcess service;
    private final ServicesUsers servicesUsers;

    public ControllerSubProcess(ServicesSubProcess service, ServicesUsers servicesUsers){
        this.service = service;
        this.servicesUsers = servicesUsers;
    }

    @GetMapping("/{id}")
    public String getAll(@PathVariable("id") Long id, Model model){
        List<SubProcessAction> lista = service.getAll(id);
        
        List<User> listaU = servicesUsers.getUserByProcess(id);

        model.addAttribute("subProcessos", lista);

        model.addAttribute("usuarios", listaU);

        return "info_process";
    }
}
