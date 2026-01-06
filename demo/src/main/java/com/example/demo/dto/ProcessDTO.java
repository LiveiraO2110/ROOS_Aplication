package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.ProcessAction;

public record ProcessDTO(
    Long id,
    Boolean status,
    String name,
    Integer anm,
    String cliente,
    Long type,
    List<SubProcessDTO> subprocesses,
    List<Long> usersID
) {
    public ProcessDTO(ProcessAction process){
        this(
            process.getID(),
            process.getStatus(),
            process.getName(),
            process.getAnm(),
            process.getCliente(),
            process.getTypeProcess().getID(),
            process.getSubprocesses().stream().map(SubProcessDTO::new).toList(),
            process.getUserProcesses().stream().map(up -> up.getUser().getID()).toList()
        );
    }
}
