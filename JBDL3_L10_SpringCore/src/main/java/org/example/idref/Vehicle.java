package org.example.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {

    String name;
    Engine engine;

    String referenceBeanId;


    public void runVehicle(){
        System.out.println("Inside the run Vehicle, going to start the vehicle");

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/idref/config.xml");

        engine = context.getBean(referenceBeanId, Engine.class);

        System.out.println("Starting the vehicle with engine "+engine.name+" and power "+engine.power);


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceBeanId() {
        return referenceBeanId;
    }

    public void setReferenceBeanId(String referenceBeanId) {
        this.referenceBeanId = referenceBeanId;
    }


    public void init(){
        System.out.println("Inside the init method");
    }

    public void destroy(){
        System.out.println("Inside the destroy method");
    }
}
