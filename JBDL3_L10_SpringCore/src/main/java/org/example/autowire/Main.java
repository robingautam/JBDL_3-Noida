package org.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/org/example/autowire/autoconfig.xml");

      Employee employee =  context.getBean("employee", Employee.class);

        System.out.println(employee);
    }
}
