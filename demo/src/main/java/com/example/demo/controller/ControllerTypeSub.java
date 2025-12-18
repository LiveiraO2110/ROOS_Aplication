package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.SubProcessType;
import com.example.demo.service.ServicesTypeSub;

@Controller
@RequestMapping("/type/sub-type")
public class ControllerTypeSub {
    private final ServicesTypeSub service;

    public ControllerTypeSub(ServicesTypeSub service){
        this.service = service;
    }

    @GetMapping("/{id_tipo}")
    public String getAll(@PathVariable("id_tipo") Long id_tipo, Model model){
        List<SubProcessType> lista = service.getById_type(id_tipo);

        model.addAttribute("subTipos", lista);

        return "sub_process_type";
    }
}
