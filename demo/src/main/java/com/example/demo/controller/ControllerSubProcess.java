package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SubProcessDTO;
import com.example.demo.service.ServicesSubProcess;

@RestController
@RequestMapping("/process/sub-process")
public class ControllerSubProcess {
    private final ServicesSubProcess service;

    public ControllerSubProcess(ServicesSubProcess service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public List<SubProcessDTO> getAll(@PathVariable("id") Long id){
        List<SubProcessDTO> lista = service.getAll(id).stream().map(SubProcessDTO::new).toList();
        
        return lista;
    }
}
