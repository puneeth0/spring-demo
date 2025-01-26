package com.example.spring_demo.controller;

import com.example.spring_demo.dto.CharacterRequestDTO;
import com.example.spring_demo.model.HarryPotterCharacter;
import com.example.spring_demo.service.HogwartsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/potter/characters")
public class HarryPotterCharacterController {

    private final HogwartsService hogwartsService;

    public HarryPotterCharacterController(HogwartsService hogwartsService) {
        this.hogwartsService = hogwartsService;
    }

    @PostMapping
    public ResponseEntity<HarryPotterCharacter> createCharacter(@RequestBody CharacterRequestDTO requestDTO) {
        // Create character entity

        HarryPotterCharacter character = hogwartsService.addStudent(requestDTO);
        return ResponseEntity.ok(character);
    }

    @GetMapping
    public List<HarryPotterCharacter> getCharacters() {
        // Create character entity
        return hogwartsService.getAllStudent();
    }

    @Operation(summary = "Get a character by ID", description = "Retrieve a Harry Potter character by their unique ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Character retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "Character not found")
    })
    @GetMapping("/id")
    public HarryPotterCharacter getCharacterById(@RequestParam("id") String id) {
        // Create character entity

        return hogwartsService.getStudentById(Integer.parseInt(id));
    }

    ///potter/characters/50
    @GetMapping("/{id}")
    public HarryPotterCharacter getCharacterByIdPath(@PathVariable("id") String id) {
        // Create character entity

        return hogwartsService.getStudentById(Integer.parseInt(id));
    }
}