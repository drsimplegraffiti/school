package com.student.service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;
import java.util.Optional;


// The service class is used to define the business logic of the application.
// It injects the repository class to access the database.
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    // Create student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() { // return array of students using the List class
        return studentRepository.findAll();
    }

    // Get student by id
    public Student getStudentById(String id){
        return studentRepository.findById(id).orElse(null);
    }

    //Delete a student by Id
    public String deleteStudentById(String id){
        studentRepository.deleteById(id);
        return "Student removed: " + id;
    }

    // update a student by id
    public Student updateStudentById(String id, Student student){
        Student existingStudent = studentRepository.findById(id).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setStudentNumber(student.getStudentNumber());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setGpa(student.getGpa());
        existingStudent.setUpdatedAt(new Date(System.currentTimeMillis()));
        return studentRepository.save(existingStudent);
    }

}
