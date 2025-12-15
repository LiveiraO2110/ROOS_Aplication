package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TypeProcess;

public interface TypeRepo extends JpaRepository<TypeProcess, Long>{
    
}
