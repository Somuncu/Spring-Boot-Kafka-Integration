package com.example.producer.service;

import com.example.producer.dto.UserFollowers;
import com.example.producer.entity.User;
import com.example.producer.dto.UserDto;
import com.example.producer.repo.UserRepository;
import com.example.producer.util.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class KafkaSenderImpl  {

    @Value("${proje.kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, UserFollowers> kafkaTemplate;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    public void sendMessage(UserDto userDto){
        User user = userMapper.toUser(userDto);
        userRepository.save(user);
        kafkaTemplate.send(topic, UUID.randomUUID().toString(), new UserFollowers(user.getId(),user.getFollowerlist()));

    }

    public void saveDb(User user) {

    }
}
