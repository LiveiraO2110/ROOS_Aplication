package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SubProcessAction;
import com.example.demo.repository.SubProcessRepo;

@Service
public class ServicesSubProcess {
    @Autowired
    private SubProcessRepo repo;

    public List<SubProcessAction> getAll(Long id){
        return repo.findByProcessAction_ID(id);
    }
}
