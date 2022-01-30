package com.example.producer.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class UserDto {
    private int id;
    private String name;
    private String surname;
    private int[] followerlist;
}
