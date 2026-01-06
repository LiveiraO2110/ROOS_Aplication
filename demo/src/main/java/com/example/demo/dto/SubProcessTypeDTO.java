package com.example.demo.dto;

import com.example.demo.model.SubProcessType;

public record SubProcessTypeDTO(
    Long id,
    String descricao,
    Integer limite
) {
    public SubProcessTypeDTO(SubProcessType subProcessType){
        this(
            subProcessType.getID(),
            subProcessType.getDesc(),
            subProcessType.getLimite()
        );
    }
}
