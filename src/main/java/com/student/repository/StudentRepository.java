package com.student.repository;

import com.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
