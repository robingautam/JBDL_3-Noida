package org.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee2 {

    public void markAttendance(){
        System.out.println("Inside employee 2, mark attendance");
    }

    @PostConstruct
    public void customInitMethod(){
        System.out.println("Inside the init method");
    }

    @PreDestroy
    public void customDestroyMethod(){
        System.out.println("Inside the destroy method");
    }
}
