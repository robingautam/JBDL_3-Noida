package org.example;


import org.example.config.JavaConfig;
import org.example.model.Employee;
import org.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.Period;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

      //  Employee employee = context.getBean("custom", Employee.class);

      //  System.out.println(employee);

       Person person =  context.getBean("person", Person.class);

        System.out.println(person+" "+person.getVehicle());
    }
}
