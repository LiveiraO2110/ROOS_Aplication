package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.User;

public interface UsersRepository extends JpaRepository <User, Long>{
    @Query("SELECT up.process FROM UserProcess up WHERE up.user.ID = :id")
    List<ProcessAction> findProcessByUser(@Param("id")Long id);

    @Query("SELECT up.user FROM UserProcess up WHERE up.process.ID = :id")
    List<User> findUserByProcess(@Param("id")Long id);
}