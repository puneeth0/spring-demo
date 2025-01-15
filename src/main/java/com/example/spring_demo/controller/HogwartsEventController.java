package com.example.spring_demo.controller;

import com.example.spring_demo.dto.CharacterRequestDTO;
import com.example.spring_demo.model.HogwartsEvent;
import com.example.spring_demo.service.MinistryOfMagicService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/potter/events")
public class HogwartsEventController {

    private final MinistryOfMagicService service;

    public HogwartsEventController(MinistryOfMagicService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<HogwartsEvent> createCharacter(@RequestBody HogwartsEvent event) throws JsonProcessingException {
        service.postMessageToMinistry(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(event);
    }
}
