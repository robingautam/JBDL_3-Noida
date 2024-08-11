package org.example.impl;

import org.example.model.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void getVehicleType() {
        System.out.println("Inside the Car class");
    }
}
