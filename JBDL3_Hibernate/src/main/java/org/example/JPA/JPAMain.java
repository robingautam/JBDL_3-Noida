package org.example.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAMain {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Course course = new Course(1, "JBDL", "This Java Backend Course");

        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();


    }
}
