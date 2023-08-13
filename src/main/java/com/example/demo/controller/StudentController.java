package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/getStudent")
    public Student getStudenDetails(){
        return new Student("Ranjit Sahu", 24);
    }
}
