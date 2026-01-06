package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TypeProcessDTO;
import com.example.demo.service.ServicesType;

@RestController
@RequestMapping("/type")
public class ControllerType {
    private final ServicesType service;

    public ControllerType(ServicesType service){
        this.service = service;
    }

    @GetMapping
    public List<TypeProcessDTO> getAll(){
        List<TypeProcessDTO> lista = service.getAll().stream().map(TypeProcessDTO::new).toList();
        
        return lista;
    }
}
