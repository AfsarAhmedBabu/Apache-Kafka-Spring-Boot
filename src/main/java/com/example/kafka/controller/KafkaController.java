package com.example.kafka.controller;

import com.example.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private Producer producer;

    public void KafkaController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message) {
        this.producer.sendMessageToTopic(message);
    }

}
