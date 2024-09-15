package org.gfg.JBDL3_JUNITAndMockito;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonTest {

   Person p = null;

    @Test
    void eat() {
        String result = p.eat();

        Assertions.assertEquals("Person is eating",result);
        System.out.println("Inside the EAT Test method");
    }

    @Test
    void run() {
        String result = p.run();

        Assertions.assertEquals("Person is running",result);
        System.out.println("Inside the RUN Test method");
    }

    @BeforeEach
    public void beforeEach(){
        p = new Person();
        System.out.println("executing before each method");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("executing after each method");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("executing before all");
    }




}