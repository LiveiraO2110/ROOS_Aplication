package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ReadyProcess;

public interface ReadyProcessRepo extends JpaRepository <ReadyProcess, Long>{
    
}
