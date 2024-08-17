package com.example.Spring_Demo.Repository;

import com.example.Spring_Demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1,"01","Robin","robin@gmail.com",new ArrayList<>()));
        studentList.add(new Student(2,"02","Moksh","moksh@gmail.com",new ArrayList<>()));
        studentList.add(new Student(3,"03","abhinav","abhinav@gmail.com",new ArrayList<>()));
        studentList.add(new Student(4,"04","Sarthak","sarthak@gmail.com",new ArrayList<>()));
    }

    public List<Student> getAllStudentFromDB(){
        return studentList;
    }

}
