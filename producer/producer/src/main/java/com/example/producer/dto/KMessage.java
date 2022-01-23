package com.example.producer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "name","surName","messageDate"})
public class KMessage {
    private int id;
    private String name;
    private String surName;
    private int[] followerList;
    //private String id = UUID.randomUUID().toString();
    private LocalDate createdAt = LocalDate.now();
    private String message;
}
