package com.example.demo.dto;

import java.util.List;

public record TypeProcessDTO(
    Long id,
    String name,
    List<SubProcessTypeDTO> subProcessTypes
) {}
