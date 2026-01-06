package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.TypeProcess;

public record TypeProcessDTO(
    Long id,
    String name,
    List<SubProcessTypeDTO> subProcessTypes
) {

    public TypeProcessDTO(TypeProcess typeProcess) {
        this(
            typeProcess.getID(),
            typeProcess.getName(),
            typeProcess.getSubProcessType().stream().map(SubProcessTypeDTO::new).toList()
        );
    }
}