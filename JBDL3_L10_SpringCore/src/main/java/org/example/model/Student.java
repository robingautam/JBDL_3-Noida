package org.example.model;

import java.util.*;

public class Student {

    int id;
    String name;
    String email;

    List<String> subject = new ArrayList<>();
    Map<String, Integer> marks = new HashMap<>();

    Set<String> subjectList = new HashSet<>();

    Address address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting the Id");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting the name");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Setting the email");
        this.email = email;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public Set<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(Set<String> subjectList) {
        this.subjectList = subjectList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject=" + subject +
                ", marks=" + marks +
                ", subjectList=" + subjectList +
                ", address=" + address +
                '}';
    }
}
