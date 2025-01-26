package com.example.spring_demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.spring_demo.dao.HogwartsDao;
import com.example.spring_demo.dao.SpellDao;
import com.example.spring_demo.dto.CharacterRequestDTO;
import com.example.spring_demo.model.FrequentlyUsedSpell;
import com.example.spring_demo.model.HarryPotterCharacter;
import org.springframework.stereotype.Service;

@Service
public class HogwartsServiceImpl implements HogwartsService {

    private final HogwartsDao hogwartsDao;
    private final SpellDao spellsDao;

    public HogwartsServiceImpl(HogwartsDao hogwartsDao, SpellDao spellsDao) {
        this.hogwartsDao = hogwartsDao;
        this.spellsDao = spellsDao;
    }

    @Override
    public List<HarryPotterCharacter> getAllStudent() {
        // TODO Auto-generated method stub
        return hogwartsDao.findAll();
    }

    @Override
    public HarryPotterCharacter addStudent(CharacterRequestDTO requestDTO) {
        List<FrequentlyUsedSpell> spellsList = new ArrayList<>();
        for (String spell : requestDTO.frequentlyUsedSpells()) {
            Optional<FrequentlyUsedSpell> frequenOptional = spellsDao.findBySpell(spell);

            frequenOptional.ifPresent(spellsList::add);
        }
        HarryPotterCharacter character = new HarryPotterCharacter(requestDTO.name(), requestDTO.age(),
                requestDTO.house(), requestDTO.role(), requestDTO.bloodStatus(), requestDTO.team(),
                requestDTO.snitchMatchPlayer(), requestDTO.gender(), spellsList);

        return hogwartsDao.save(character);
    }

    @Override
    public HarryPotterCharacter getStudentById(int id) {
        return hogwartsDao.findById(id).isPresent() ? hogwartsDao.findById(id).get() : null;
    }

}