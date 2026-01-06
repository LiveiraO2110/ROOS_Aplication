package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProcessDTO;
import com.example.demo.service.ServicesProcess;
import com.example.demo.service.ServicesUserProcess;

@RestController
@RequestMapping("/process")
public class ControllerProcess {
    private final ServicesProcess service;
    // private final ServicesUserProcess service_user_process;

    public ControllerProcess(ServicesProcess service, ServicesUserProcess service_user_process) {
        this.service = service;
        // this.service_user_process = service_user_process;
    }

    @GetMapping
    public List<ProcessDTO> getAll(){
        List<ProcessDTO> lista = service.getAll().stream().map(ProcessDTO::new).toList();
        
        return lista;
    }
}