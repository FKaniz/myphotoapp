package com.example.myphotoapp.resource;

import com.example.myphotoapp.model.User;
import com.example.myphotoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserResources {
    @Autowired
    private UserService userService;
    @GetMapping("/album")
    public User getUser(){
       return userService.getUser();

    }
    @PostMapping("/album")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);

    }
}
