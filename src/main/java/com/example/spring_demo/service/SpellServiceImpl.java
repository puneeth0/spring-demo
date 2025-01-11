package com.example.spring_demo.service;

import com.example.spring_demo.dao.SpellDao;
import com.example.spring_demo.model.FrequentlyUsedSpell;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpellServiceImpl implements SpellService {

    private final SpellDao spellDao;

    public SpellServiceImpl(SpellDao spellDao) {
        this.spellDao = spellDao;
    }

    @Override
    public List<FrequentlyUsedSpell> getListOfSpell() {
        return spellDao.findAll();
    }

    @Override
    public List<FrequentlyUsedSpell> getListOfSpellWithSeverity(String severity) {
        return spellDao.findAll().stream().filter(spells -> severity.equalsIgnoreCase(spells.getSeverity().name())).collect(Collectors.toList());
    }

    @Override
    public List<FrequentlyUsedSpell> getDeadlySpells() {
        return spellDao.findAll().stream().filter(spells -> "Avada Kedavra".equals(spells.getSpell())||"Crucio".equals(spells.getSpell())||"Imperius".equals(spells.getSpell())).collect(Collectors.toList());
    }
}
