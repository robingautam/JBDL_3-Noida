package org.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
    String name;
    String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void markAttendance(){
        System.out.println("Inside the mark attendance");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside the init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside the destroy method");
    }
}
