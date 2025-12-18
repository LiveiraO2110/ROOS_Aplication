package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserProcess;

public interface UserProcessRepo extends JpaRepository<UserProcess, Long>{
    
}