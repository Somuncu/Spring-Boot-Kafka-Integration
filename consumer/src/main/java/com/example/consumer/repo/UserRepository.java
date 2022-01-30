package com.example.consumer.repo;


import com.example.consumer.dto.UserFollowers;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<UserFollowers,Integer> {
}
