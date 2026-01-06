package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.User;

public record UserDTO(
    Long id,
    String name,
    String email,
    List<Long> processesID
) {
    public UserDTO(User user){
        this(user.getID(), user.getName(), user.getEmail(), user.getUserProcess().stream().map(up -> up.getProcess().getID()).toList());
    }
}

