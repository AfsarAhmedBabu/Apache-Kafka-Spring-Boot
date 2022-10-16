package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "kafka_topic", groupId = "group_id")
    public void consume(String message) {
        System.out.println(message);
    }

}
