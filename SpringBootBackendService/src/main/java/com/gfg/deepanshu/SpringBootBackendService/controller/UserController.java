package com.gfg.deepanshu.SpringBootBackendService.controller;

import com.gfg.deepanshu.SpringBootBackendService.model.User;
import com.gfg.deepanshu.SpringBootBackendService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public User deleteUser(@PathVariable("id") Long id){
        return userService.deleteUser(id);
    }
}
