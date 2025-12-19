package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.SubProcessType;
import com.example.demo.model.TypeProcess;
import com.example.demo.repository.ProcessRepo;
import com.example.demo.repository.SubProcessTypeRepo;
import com.example.demo.repository.TypeRepo;

import jakarta.transaction.Transactional;

@Service
public class ServicesProcess {

    private final ProcessRepo repo;
    private final TypeRepo type_repo;
    private final SubProcessTypeRepo sub_type_repo;
    private final ServicesSubProcess service_sub;

    public ServicesProcess(ProcessRepo repo, TypeRepo type, SubProcessTypeRepo sub_type_repo, ServicesSubProcess service_sub) {
        this.repo = repo;
        this.type_repo = type;
        this.sub_type_repo = sub_type_repo;
        this.service_sub = service_sub;
    }

    @Transactional
    public ProcessAction createProcess(Long typeId, Integer anm, String cliente, Long userId, LocalDate prazo) {
        ProcessAction process = new ProcessAction();

        TypeProcess type = type_repo.findById(typeId).orElseThrow(() -> new RuntimeException("Tpo não encontrado"));
        List<SubProcessType> subType = sub_type_repo.findByTypeProcess_ID(typeId);

        process.setAnm(anm);
        process.setCliente(cliente);
        process.setName(type.getName());
        process.setStatus(false);   
        process.setTypeProcess(type);
        process.setPrazo(prazo);
    
        process = repo.save(process);

        System.out.println(subType.size());

        for (SubProcessType sub : subType) {
            service_sub.createSubProcess(process, sub.getDesc(), sub.getLimite(), prazo);
        }

        return process;
    }

    public List<ProcessAction> getAll(){
        return repo.findAll();
    }
}
