package org.example.config;

import org.example.model.Address;
import org.example.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class JavaConfig {

    @Bean(name = {"getEmployee", "custom"})
    public Employee employee(){
        Employee employee = new Employee();
        employee.setName("sagar");
        employee.setAddress(address());
        return employee;
    }

    @Bean
    public Address address(){
        Address address = new Address();
        address.setStreet("M.V Phase-2");
        return address;
    }


}
