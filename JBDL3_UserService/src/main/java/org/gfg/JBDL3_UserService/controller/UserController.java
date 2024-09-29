package org.gfg.JBDL3_UserService.controller;

import org.gfg.JBDL3_UserService.model.User;
import org.gfg.JBDL3_UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    @RequestMapping("/get/user/{id}")
    public User getUserById(@PathVariable("id") int id){
       return userService.getUserById(id);
    }

    @GetMapping("/get/users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
