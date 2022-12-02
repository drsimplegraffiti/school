package com.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

// The model class is used to define the structure of the data that will be stored in the database.

@Document(collection = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private String id;
    private String name;
    private int age;
    private long studentNumber;
    private String email;
    private float gpa;
    private Date createdAt = new Date();
    private Date updatedAt = new Date();

}
