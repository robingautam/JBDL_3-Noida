package com.example.Spring_Demo.controller;

import com.example.Spring_Demo.model.Student;
import com.example.Spring_Demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("/students/student")
    public List<Student> getAllStudent(){
        List<Student> list = studentService.getAllStudent();
        if (list==null){
            return null;
        }else {
            return list;
        }
    }

    @GetMapping(value = "/students/student/get/{studentId}", produces = MediaType.APPLICATION_XML_VALUE )

    public Student getStudentById(@PathVariable("studentId") int id){
       return studentService.getStudentById(id);
    }

    @GetMapping("/students/student/get")
    public Student getStudentByIdRequestParam(@RequestParam("studentId") int id){
        return studentService.getStudentById(id);
    }
}
