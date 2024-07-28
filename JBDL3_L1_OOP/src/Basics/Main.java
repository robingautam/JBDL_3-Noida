package Basics;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Robin");
        person.setEmail("robin@gmail.com");
        person.setAge(-1);


        Person person2 = new Person();
        person2.setName("Robin");
        person2.setEmail("robin@gmail.com");
        person2.setAge(23);

        System.out.println(person);




    }
}
