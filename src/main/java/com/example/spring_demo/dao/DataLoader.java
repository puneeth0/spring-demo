package com.example.spring_demo.dao;

import java.util.List;
import com.example.spring_demo.model.FrequentlyUsedSpell;
import com.example.spring_demo.model.HarryPotterCharacter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final HogwartsDao characterRepository;
    private final SpellDao spellRepository;
    private final DataLoadBuilder builder;

    public DataLoader(HogwartsDao characterRepository, SpellDao spellRepository, DataLoadBuilder builder) {
        this.characterRepository = characterRepository;
        this.spellRepository = spellRepository;
        this.builder = builder;
    }

    @Override
    public void run(String... args) {
        spellRepository.saveAll(builder.buildSpellsLoad());
        characterRepository.saveAll(builder.getHogwartsStudents());

        /*FrequentlyUsedSpell spell1 = new FrequentlyUsedSpell("Expelliarmus", harry);
        FrequentlyUsedSpell spell2 = new FrequentlyUsedSpell("Expecto Patronum", harry);
        spellRepository.saveAll(List.of(spell1, spell2));*/
    }
}
