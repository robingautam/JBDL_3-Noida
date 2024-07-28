package org.example.constructor;

public class Person {

    int  id;
    String name;
    String address;

    Person(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    Person(int id, String address){
        System.out.println("Constructor Called: int, String");
        //this.id = id;
        this.id = id;
        this.address = address;
    }
    Person(String name, String address){
        System.out.println("Constructor Called: String, String");
        //this.id = id;
        this.name = name;
        this.address = address;
    }




}
