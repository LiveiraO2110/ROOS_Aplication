package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserProcess;
import com.example.demo.repository.ProcessRepo;
import com.example.demo.repository.UserProcessRepo;
import com.example.demo.repository.UsersRepository;
import com.example.demo.model.User;

@Service
public class ServicesUserProcess {
    private final UserProcessRepo repo;
    private final ProcessRepo p_repo;
    private final UsersRepository u_repo;

    public ServicesUserProcess (UserProcessRepo repo, ProcessRepo p_repo, UsersRepository u_repo){
        this.repo = repo;
        this.p_repo = p_repo;
        this.u_repo = u_repo;
    }

    public UserProcess createUserProcess (Long id_user, Long id_process){
        ProcessAction process = p_repo.findById(id_process).orElseThrow(() -> new RuntimeException("Processo não encontrado"));
        User user = u_repo.findById(id_user).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        
        return repo.save(user);
    }
}
