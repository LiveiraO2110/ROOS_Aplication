package com.example.demo.dto;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.User;

public record UserProcessDTO(
    ProcessAction process,
    User user
) 
{}
