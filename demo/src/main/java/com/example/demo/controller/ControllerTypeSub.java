package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SubProcessTypeDTO;
import com.example.demo.service.ServicesTypeSub;

@RestController
@RequestMapping("/type/sub-type")
public class ControllerTypeSub {
    private final ServicesTypeSub service;

    public ControllerTypeSub(ServicesTypeSub service){
        this.service = service;
    }

    @GetMapping("/{id_tipo}")
    public List<SubProcessTypeDTO> getAll(@PathVariable("id_tipo") Long id_tipo){
        List<SubProcessTypeDTO> lista = service.getAll().stream().map(SubProcessTypeDTO::new).toList();
        
        return lista;
    }
}
