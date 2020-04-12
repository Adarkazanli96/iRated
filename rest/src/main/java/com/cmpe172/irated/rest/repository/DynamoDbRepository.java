package com.cmpe172.irated.rest.repository;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.cmpe172.irated.rest.model.Student;

@Repository
public class DynamoDbRepository {
    public static final Logger LOGGER = LoggerFactory.getLogger(DynamoDbRepository.class);

    @Autowired
    private DynamoDBMapper mapper;

    public void insertIntoDynamoDB(Student student){
        mapper.save(student);
    }
}