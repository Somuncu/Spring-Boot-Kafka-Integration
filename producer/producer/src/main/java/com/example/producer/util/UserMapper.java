package com.example.producer.util;

import com.example.producer.entity.User;
import com.example.producer.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        String followerList ="";
        for (int follower : userDto.getFollowerlist()) {
            followerList += String.valueOf(follower)+";";
        }
        user.setFollowerlist(followerList);
        return user;
    }
}
