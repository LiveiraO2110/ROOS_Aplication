package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.SubProcessType;
import com.example.demo.model.TypeProcess;
import com.example.demo.repository.SubProcessTypeRepo;
import com.example.demo.repository.TypeRepo;

@Service
public class ServicesTypeSub {
    private final SubProcessTypeRepo repo;
    private final TypeRepo t_repo;

    public ServicesTypeSub(SubProcessTypeRepo repo, TypeRepo t_repo) {
        this.repo = repo;
        this.t_repo = t_repo;
    }

    public SubProcessType createType(String desc, Integer limit, Long id_type) {
        SubProcessType type = new SubProcessType();
        
        TypeProcess t_process = t_repo.findById(id_type).orElseThrow(() -> new RuntimeException("Tipo não encontrado"));

        type.setDesc(desc);
        type.setId_type(t_process);
        type.setLimit(limit);

        return repo.save(type);
    }
}
