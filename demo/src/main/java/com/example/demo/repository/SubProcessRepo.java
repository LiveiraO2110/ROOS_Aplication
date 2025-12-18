package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.SubProcessAction;

public interface SubProcessRepo extends JpaRepository<SubProcessAction, Long>{
    @Query("SELECT s FROM SubProcessAction s WHERE s.process.ID = :id")
    List<SubProcessAction> findByProcessAction_ID(@Param("id") Long id);
}
