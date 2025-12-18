package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.User;
import com.example.demo.repository.UsersRepository;

@Service
public class ServicesUsers {
    public final UsersRepository repo;

    public ServicesUsers(UsersRepository repo) {
        this.repo = repo;
    }

    public List<User> getAll(){
        return repo.findAll();
    }

    public User save (User user){
        return repo.save(user);
    }

    public void delete (Long ID){
        repo.deleteById(ID);
    }

    public User createUser(String name, String email, String password){
        User user = new User();

        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);

        return repo.save(user);
    }

    public List<ProcessAction> getProcessByUser(Long id){
        return repo.findProcessByUser(id);
    }

    public User getUserById(Long id){
        User user = repo.findById(id).orElseThrow(() -> new RuntimeException("User não encontrado"));

        return user;
    }
    
    public List<User> getUserByProcess(Long id){
        return repo.findUserByProcess(id);
    }
}
