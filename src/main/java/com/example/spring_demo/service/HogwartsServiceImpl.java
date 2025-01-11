package com.example.spring_demo.service;

import java.util.List;
import java.util.Optional;

import com.example.spring_demo.dao.HogwartsDao;
import com.example.spring_demo.dao.SpellDao;
import com.example.spring_demo.model.FrequentlyUsedSpell;
import com.example.spring_demo.model.HarryPotterCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HogwartsServiceImpl implements HogwartsService {

    @Autowired
    private HogwartsDao
            hogwartsDao;

    @Autowired
    private SpellDao spellsDao;

    @Override
    public List<HarryPotterCharacter> getAllStudent() {
        // TODO Auto-generated method stub
        return hogwartsDao.findAll();
    }

    @Override
    public HarryPotterCharacter addStudent(HarryPotterCharacter student) {
        // TODO Auto-generated method stub
        return hogwartsDao.save(student);
    }

    @Override
    public List<FrequentlyUsedSpell> getAllSpells() {
        // TODO Auto-generated method stub
        return spellsDao.findAll();
    }

    @Override
    public HarryPotterCharacter getStudentById(int id) {
        return hogwartsDao.findById(id).isPresent() ? hogwartsDao.findById(id).get() : null;
    }

}
