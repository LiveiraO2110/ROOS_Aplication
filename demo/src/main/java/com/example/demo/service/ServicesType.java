package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.TypeProcess;
import com.example.demo.repository.TypeRepo;

@Service
public class ServicesType {
    private final TypeRepo repo;

    public ServicesType(TypeRepo repo) {
        this.repo = repo;
    }

    public TypeProcess createType(String name) {
        TypeProcess type = new TypeProcess(name);
        
        return repo.save(type);
    }
}
