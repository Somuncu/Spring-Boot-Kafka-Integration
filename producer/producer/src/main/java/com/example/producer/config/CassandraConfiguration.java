package com.example.producer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
@EnableReactiveCassandraRepositories
public class CassandraConfiguration extends AbstractCassandraConfiguration {

    @Value("${spcloud.cassandra.keyspace.name}")
    private String keyspacename;

    @Value("${spcloud.cassandra.contact.point}")
    private String contactpoint;

    @Value("${spcloud.cassandra.port}")
    private int port;

    @Override
    protected String getKeyspaceName() {
        return keyspacename;
    }

    @Override
    protected int getPort(){
        return port;
    }

    @Override
    protected String getContactPoints(){
        return contactpoint;
    }



}
