package org.example;

import org.example.model.SportsCard;
import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

      /*  Student st = (Student) context.getBean("studenr2");

        System.out.println(st);*/


        SportsCard sportsCard = (SportsCard) context.getBean("aliasSuperCarTag");

        System.out.println(sportsCard);


    }
}
