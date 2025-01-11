package com.example.spring_demo.dao;

import com.example.spring_demo.model.FrequentlyUsedSpell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellDao extends JpaRepository<FrequentlyUsedSpell, Integer>{

}
