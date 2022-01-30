package com.example.producer.controller;

import com.example.producer.entity.User;
import com.example.producer.dto.UserDto;
import com.example.producer.service.KafkaSenderImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ResourceController {

    @Autowired
    KafkaSenderImpl kafkaSenderImpl;

    @PostMapping("/send")
    public void sendMessage(@RequestBody UserDto user) {
        kafkaSenderImpl.sendMessage(user);
    }
}
