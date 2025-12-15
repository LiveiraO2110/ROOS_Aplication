package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.TypeProcess;
import com.example.demo.model.User;
import com.example.demo.model.UserProcess;
import com.example.demo.repository.ProcessRepo;
import com.example.demo.repository.TypeRepo;
import com.example.demo.repository.UsersRepository;

@Service
public class ServicesProcess {

    private final ProcessRepo repo;
    private final TypeRepo type_repo;
    private final UsersRepository user_repo;

    public ServicesProcess(ProcessRepo repo, TypeRepo type, UsersRepository user) {
        this.repo = repo;
        this.type_repo = type;
        this.user_repo = user;
    }

    public ProcessAction createProcess(Long typeId, String name, Integer anm, String cliente, Long userId) {
        ProcessAction process = new ProcessAction();

        TypeProcess type = type_repo.findById(typeId).orElseThrow(() -> new RuntimeException("Tpo não encontrado"));
        
        User user = user_repo.findById(userId).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        process.setANM(anm);
        process.setCliente(cliente);
        process.setName(type.getName());
        process.setStatus(false);   
        process.setTypeProcess(type);

        UserProcess up = new UserProcess();
        up.setUser(user);
        up.setProcess(process);

        process.getUserProcesses().add(up);

        return repo.save(process);
    }
}
