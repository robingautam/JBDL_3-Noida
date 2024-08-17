package com.example.Spring_Demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    int id;
    String rollNo;
    String name;
    String email;
    List<String> marks;

}
