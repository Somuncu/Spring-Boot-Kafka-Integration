package com.example.producer.service;

import com.example.producer.entity.User;

public interface KafkaSender {

    public void saveDb(User user);
}
