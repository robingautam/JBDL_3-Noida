package com.example.Spring_Demo.service;

import com.example.Spring_Demo.Repository.StudentRepository;
import com.example.Spring_Demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.getAllStudentFromDB();
    }

    public Student getStudentById(int id){
        List<Student> studentList = studentRepository.getAllStudentFromDB();
        for (Student student: studentList){
            if (student.getId()==id){
                return student;
            }
        }
        return null;
    }

}
