package com.concent.curd.controllers;

import com.concent.curd.models.Student;
import com.concent.curd.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/students")
    public void  createStudent(@RequestBody Student student) {
        Student savedStudent = studentRepo.save(student);
    }
    @GetMapping("/students")
    public List<Student> retrieveAllStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/students/{id}")
    public Student retrieveStudentById(@PathVariable long id) {
     return studentRepo.findById(id).get();
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentRepo.deleteById(id);
    }

}
