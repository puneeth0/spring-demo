package com.example.spring_demo.controller;

import com.example.spring_demo.model.FrequentlyUsedSpell;
import com.example.spring_demo.service.SpellService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/potter/spells")
public class FrequentlyUsedSpellController {

    private final SpellService service;

    public FrequentlyUsedSpellController(SpellService service) {
        this.service = service;
    }

    @GetMapping
    public List<FrequentlyUsedSpell> getFrequentlyUsedSpells(){
        return service.getListOfSpell();
    }

    @GetMapping("/severity")
    public List<FrequentlyUsedSpell> getFrequentlyUsedSpellsFiltered(@RequestParam String severity){
        return service.getListOfSpellWithSeverity(severity);
    }

    @GetMapping("/deadly-spells")
    public List<FrequentlyUsedSpell> getDeadlySpells(){
        return service.getDeadlySpells();
    }
}
