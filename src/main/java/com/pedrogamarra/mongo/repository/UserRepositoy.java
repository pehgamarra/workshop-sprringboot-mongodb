package com.pedrogamarra.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pedrogamarra.mongo.domain.User;

@Repository
public interface UserRepositoy extends MongoRepository<User, String>{

}
