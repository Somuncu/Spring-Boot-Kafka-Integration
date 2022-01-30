package com.example.consumer.service;

import com.example.consumer.dto.UserFollowers;
import com.example.consumer.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class KafkaListenerService {

    @Autowired
    UserRepository userRepository;

    @KafkaListener(
            topics = "${proje.kafka.topic}",
            groupId = "${proje.kafka.group.id}"
    )
    public void listen(@Payload UserFollowers userFollowers) {
        userRepository.save(userFollowers);

        log.info("User received from consumer.. MessageID : {} Message: {} Date : {}, followerList : {}",
                userFollowers.getId(),
                userFollowers.getFollowerlist());
    }

    public List<UserFollowers> getUserFollowers(){
        return userRepository.findAll();
    }



}
