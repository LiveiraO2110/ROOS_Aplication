package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SubProcessType;
import com.example.demo.service.ServicesTypeSub;

@RestController
@RequestMapping("/type-sub")
public class ControllerTypeSub {
    private final ServicesTypeSub service;

    public ControllerTypeSub(ServicesTypeSub service){
        this.service = service;
    }

    @GetMapping
    public List<SubProcessType> getAll(){
        return service.getAll();
    }
}
