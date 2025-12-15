package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ProcessAction;

public interface ProcessRepo extends JpaRepository<ProcessAction, Long>{
    @Query("""
    SELECT p
    FROM ProcessAction p
    JOIN UserProcess up
    WHERE up.process.ID = p.ID 
    """)
    List<ProcessAction> processAtUserProcess();
}
