package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProcessAction;

public interface ProcessRepo extends JpaRepository<ProcessAction, Long>{

}
