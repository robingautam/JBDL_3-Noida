package org.example.impl;

import org.example.model.Vehicle;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {
    @Override
    public void getVehicleType() {
        System.out.println("inside the Bike class");
    }


}
