package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
}
