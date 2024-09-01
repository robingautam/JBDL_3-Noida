package org.example.Mapping;

import org.example.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class MappingMain {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Student student = new Student(1, "Robin", "robin@gmail.com");

        Laptop laptop = new Laptop(1001,"HP");

        student.setLaptop(Arrays.asList(laptop));

        laptop.setStudent(student);


        session.beginTransaction();

        session.save(student);
        session.save(laptop);



        session.getTransaction().commit();

    }
}
