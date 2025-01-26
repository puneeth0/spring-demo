package com.example.spring_demo.service;

import java.util.List;
import com.example.spring_demo.dto.CharacterRequestDTO;
import com.example.spring_demo.model.HarryPotterCharacter;

public interface HogwartsService {
	List<HarryPotterCharacter> getAllStudent();
	HarryPotterCharacter addStudent(CharacterRequestDTO requestDTO);
	HarryPotterCharacter getStudentById(int l);
}
