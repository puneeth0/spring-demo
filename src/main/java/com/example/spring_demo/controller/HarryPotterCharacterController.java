package com.example.spring_demo.controller;

import com.example.spring_demo.dao.HogwartsDao;
import com.example.spring_demo.dao.SpellDao;
import com.example.spring_demo.dto.CharacterRequestDTO;
import com.example.spring_demo.model.FrequentlyUsedSpell;
import com.example.spring_demo.model.HarryPotterCharacter;
import com.example.spring_demo.service.HogwartsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/potter/characters")
public class HarryPotterCharacterController {

	private final HogwartsDao characterRepository;
	private final SpellDao spellRepository;
	private final HogwartsService hogwartsService;

	public HarryPotterCharacterController(HogwartsDao characterRepository, SpellDao spellRepository, HogwartsService hogwartsService) {
		this.characterRepository = characterRepository;
		this.spellRepository = spellRepository;
        this.hogwartsService = hogwartsService;
    }

	@PostMapping
	public ResponseEntity<String> createCharacter( @RequestBody CharacterRequestDTO requestDTO) {
		// Create character entity
		System.out.println(requestDTO);
		HarryPotterCharacter character = new HarryPotterCharacter(requestDTO.name(), requestDTO.age(),
				requestDTO.house(), requestDTO.role(), requestDTO.bloodStatus(), requestDTO.team(),
				requestDTO.snitchMatchPlayer(), requestDTO.gender(),  null // We will
																												// populate	 // spe
				// later
		);

		// Save character first
		character = characterRepository.save(character);

		// Map spells and save them
		Set<HarryPotterCharacter> finalCharacter = new HashSet<>();
		finalCharacter.add(character);
		List<FrequentlyUsedSpell> spells =
		  requestDTO.frequentlyUsedSpells().stream() .map(spell -> new
		  FrequentlyUsedSpell(spell, finalCharacter)) .toList();
		 spellRepository.saveAll(spells);

		return ResponseEntity.ok("Character created successfully with ID: " + character.getId());
	}

	@GetMapping
	public List<HarryPotterCharacter> getCharacters() {
		// Create character entity
		return hogwartsService.getAllStudent();
	}

	@GetMapping("/id")
	public HarryPotterCharacter getCharacterById(@RequestParam("id") String id) {
		// Create character entity

		return hogwartsService.getStudentById(Integer.parseInt(id));
	}
}
