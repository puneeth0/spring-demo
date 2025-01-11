package com.example.spring_demo.service;

import java.util.List;
import com.example.spring_demo.model.FrequentlyUsedSpell;
import com.example.spring_demo.model.HarryPotterCharacter;

public interface HogwartsService {
	public List<HarryPotterCharacter> getAllStudent();
	public HarryPotterCharacter addStudent(com.example.spring_demo.model.HarryPotterCharacter school);
	public List<com.example.spring_demo.model.FrequentlyUsedSpell> getAllSpells();
	HarryPotterCharacter getStudentById(int l);
}
