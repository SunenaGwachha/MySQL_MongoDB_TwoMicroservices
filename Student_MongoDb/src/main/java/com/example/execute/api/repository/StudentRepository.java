package com.example.execute.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.execute.api.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
