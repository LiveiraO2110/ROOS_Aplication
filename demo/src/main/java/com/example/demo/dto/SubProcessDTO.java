package com.example.demo.dto;

import java.time.LocalDate;

public record SubProcessDTO(
    Long id,
    Boolean status,
    String descricao,
    Integer limite,
    LocalDate prazo,
    String obs
) {}

