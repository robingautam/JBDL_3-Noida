package org.example.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/example/idref/config.xml");

        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

        vehicle.runVehicle();

        context.registerShutdownHook();

    }
}
