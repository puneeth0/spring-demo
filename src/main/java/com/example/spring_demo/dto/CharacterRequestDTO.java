package com.example.spring_demo.dto;

import java.util.List;

public record CharacterRequestDTO(
        String name,
        int age,
        String house,
        String role,
        String bloodStatus,
        String team,
        String snitchMatchPlayer,
        String gender,
        String powerfulSpell,
        List<String> frequentlyUsedSpells
) {}
