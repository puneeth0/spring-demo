package com.example.spring_demo.dao;

import com.example.spring_demo.model.FrequentlyUsedSpell;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SpellDao extends JpaRepository<FrequentlyUsedSpell, Integer>{
    Optional<FrequentlyUsedSpell> findBySpell(String spell);
}
