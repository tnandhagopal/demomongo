package com.anandan.mongo.demomongo.repo;

import com.anandan.mongo.demomongo.entity.MyData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyDataRepo extends MongoRepository<MyData, String> {
}
