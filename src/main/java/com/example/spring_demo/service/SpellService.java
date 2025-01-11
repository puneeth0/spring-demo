package com.example.spring_demo.service;

import com.example.spring_demo.model.FrequentlyUsedSpell;

import java.util.List;

public interface SpellService {

    public List<FrequentlyUsedSpell> getListOfSpell();

    List<FrequentlyUsedSpell> getListOfSpellWithSeverity(String severity);

    List<FrequentlyUsedSpell> getDeadlySpells();
}
