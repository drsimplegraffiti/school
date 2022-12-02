package com.student.controller;

import com.student.model.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// The controller class is used to define the endpoints of the application.
// It calls and injects the service class to access the business logic.

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable String id){
        return  studentService.deleteStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable String id, @RequestBody Student student){
        return studentService.updateStudentById(id, student);
    }
}
