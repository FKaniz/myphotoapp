package com.example.myphotoapp.resource;

import com.example.myphotoapp.model.User;
import com.example.myphotoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResources {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public User getUser(){
       return userService.getUser();

    }
    @GetMapping("/allUser")
    public List<User> getAllUser(){
        return userService.getAllUser();

    }
    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId")int userId){
        return userService.getUserById(userId);
    }
    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);

    }
    @DeleteMapping ("/user")
    public User deleteUser(@RequestParam(name= "userId")int userId){
        return userService.deleteUser(userId);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable("userId")int userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

}
