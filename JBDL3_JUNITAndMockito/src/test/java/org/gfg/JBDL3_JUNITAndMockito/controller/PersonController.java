package org.gfg.JBDL3_JUNITAndMockito.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {


    @RequestMapping("/create/person")
    public ResponseEntity<String> createPerson(){
        return new ResponseEntity<>("Person is created", HttpStatus.CREATED);
    }
}
