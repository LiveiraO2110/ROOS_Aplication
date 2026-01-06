package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.ServicesUsers;

@RestController
@RequestMapping("/user")
public class ControllerUsers {
    private final ServicesUsers service;

    public ControllerUsers (ServicesUsers service){
        this.service = service;
    }

    @GetMapping
    public List<UserDTO> getAll(){
        List<UserDTO> lista = service.getAll().stream().map(UserDTO::new).toList();

        return lista;
    }

    @GetMapping("{id}")
    public UserDTO profile(@PathVariable("id") Long id){
        return new UserDTO(service.getUserById(id));
    }
}