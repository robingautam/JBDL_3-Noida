package org.example.utilSchema;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/org/example/utilSchema/utilconfig.xml");

       Person2 person =  context.getBean("person2", Person2.class);

        System.out.println(person);

    }
}
