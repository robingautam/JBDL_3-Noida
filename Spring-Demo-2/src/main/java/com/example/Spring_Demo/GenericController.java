package com.example.Spring_Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller

public class GenericController {


    @RequestMapping("/get/first")
    public String firstControllerRequest(){
        return "This is the first controller";
    }

    @RequestMapping("/get/person")
    public  Person firstControllerPerson(){
        Person p = new Person();
        p.setName("Robin");
        p.setId(2);
        return p;
    }

    @RequestMapping("/get/data/person")
    public String getPersonIdData(@RequestBody Person person) throws Exception {
        System.out.println("Person: "+person);
        if (person.getId()==1){
            return "Id value is one";
        }else {
            return "Id Value is not one";
        }
    }
}
