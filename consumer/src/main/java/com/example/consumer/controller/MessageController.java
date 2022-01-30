package com.example.consumer.controller;

import com.example.consumer.dto.UserFollowers;
import com.example.consumer.service.KafkaListenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {

    @Autowired
    KafkaListenerService kafkaListenerService;

    @GetMapping("/userfollowers")
    public List<UserFollowers> getUserFollowers() {
        return kafkaListenerService.getUserFollowers();
    }
}
