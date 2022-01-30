package com.example.producer.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of ="id")
@ToString
@Data
@Table(value="users")
public class User {
    @PrimaryKey
    @Id
    private int id;
    @Column(value = "name")
    private String name;
    @Column(value = "surname")
    private String surname;
    @Column(value = "followerlist")
    private String followerlist;
    //private String id = UUID.randomUUID().toString();
    @Column(value = "createdat")
    private String createdAt = LocalDate.now().toString();
    //private String message;
}
