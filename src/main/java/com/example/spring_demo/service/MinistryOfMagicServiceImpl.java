package com.example.spring_demo.service;

import com.example.spring_demo.model.HogwartsEvent;
import com.example.spring_demo.producer.HogwartsEventProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

@Service
public class MinistryOfMagicServiceImpl implements MinistryOfMagicService{

    private final HogwartsEventProducer hogwartsEventProducer;

    public MinistryOfMagicServiceImpl(HogwartsEventProducer hogwartsEventProducer) {
        this.hogwartsEventProducer = hogwartsEventProducer;
    }

    @Override
    public void postMessageToMinistry(HogwartsEvent event) throws JsonProcessingException {
        hogwartsEventProducer.sendHogwartsEvent(event);
    }
}
