package com.example.demo.dto;
import com.example.demo.model.UserProcess;

public record UserProcessDTO(
    Long id,
    Long processId,
    Long user
) 
{
    public UserProcessDTO(UserProcess userProcess){
        this(
            userProcess.getID(),
            userProcess.getProcess().getID(),
            userProcess.getUser().getID()
        );
    }
}
