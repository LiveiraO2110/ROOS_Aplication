package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.model.SubProcessAction;

public record SubProcessDTO(
    Long id,
    Boolean status,
    String descricao,
    Integer limite,
    LocalDate prazo,
    String obs
) {
    public SubProcessDTO(SubProcessAction subProcess){
        this(
            subProcess.getID(),
            subProcess.getStatus(),
            subProcess.getDesc(),
            subProcess.getLimite(),
            subProcess.getPrazo(),
            subProcess.getObs()
        );
    }
}

