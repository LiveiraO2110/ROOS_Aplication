package com.example.demo.dto;

import java.util.List;

public record ProcessDTO(
    Long id,
    Boolean status,
    String name,
    Integer anm,
    String cliente,
    TypeProcessDTO type,
    List<SubProcessDTO> subprocesses
) {}
