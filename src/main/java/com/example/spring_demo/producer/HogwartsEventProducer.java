package com.example.spring_demo.producer;

import com.example.spring_demo.model.HogwartsEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@Slf4j
@PropertySource(value={"classpath:application.properties"})
public class HogwartsEventProducer {
    @Value("${spring.kafka.topic}")
    private String topic;
    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public HogwartsEventProducer(ObjectMapper objectMapper, KafkaTemplate<String, String> kafkaTemplate) {
        this.objectMapper = objectMapper;
        this.kafkaTemplate = kafkaTemplate;
    }

    public CompletableFuture<SendResult<String, String>> sendHogwartsEvent(HogwartsEvent libraryEvent) throws JsonProcessingException {
        var key = libraryEvent.subject();
        var value = objectMapper.writeValueAsString(libraryEvent.message());
        var completableFuture = kafkaTemplate.send(topic, key, value);
        return completableFuture.whenComplete((sendResult, throwable) -> {
            if (throwable == null) {
                getSuccessInfo(sendResult, key, value);
            } else {
                System.out.println("Error while sending messaage "+ throwable.getMessage()+" "+ throwable);
            }
        });
    }

    private static void getSuccessInfo(SendResult<String, String> sendResult, String key, String value) {
       // log.info("Message sent successfully key : {} value : {} partition : {} ", key, value, sendResult.getRecordMetadata().partition());
    }
}
