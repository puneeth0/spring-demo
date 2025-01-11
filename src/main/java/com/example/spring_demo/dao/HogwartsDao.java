package com.example.spring_demo.dao;

import com.example.spring_demo.model.HarryPotterCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HogwartsDao extends JpaRepository<HarryPotterCharacter, Integer>{
	
}
