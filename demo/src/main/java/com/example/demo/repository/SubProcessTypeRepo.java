package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SubProcessType;

public interface SubProcessTypeRepo extends JpaRepository<SubProcessType, Long>{
    
}
