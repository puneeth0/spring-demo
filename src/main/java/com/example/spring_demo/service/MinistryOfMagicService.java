package com.example.spring_demo.service;

import com.example.spring_demo.model.HogwartsEvent;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface MinistryOfMagicService {
    public void postMessageToMinistry(HogwartsEvent event) throws JsonProcessingException;
}
