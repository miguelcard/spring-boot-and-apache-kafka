package com.amigoscode.producer.controller;

import com.amigoscode.producer.data.MessageRequestDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message/")
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void sendMessageToQueue(@RequestBody MessageRequestDto message) {
        // and then send message!
        // you could so the following in a service but lets keep it simple
        kafkaTemplate.send("amigoscode", message.getMessage());
        // that´s it! message is sent to the topic
    }
}

/**
 * Full documentation Spring for Kafka here: https://spring.io/projects/spring-kafka/#overview
 */