package org.example.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/org/example/constructor/consconfig.xml");

       Person p = (Person) context.getBean("person");

        System.out.println(p);
    }
}
