package com.project.Spring_Mongo.repository;

import com.project.Spring_Mongo.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {
    List<Todo> findByUserId (String Id);
}
