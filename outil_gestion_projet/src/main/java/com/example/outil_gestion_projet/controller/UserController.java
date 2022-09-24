package com.example.outil_gestion_projet.controller;

import com.example.outil_gestion_projet.model.User;

import com.example.outil_gestion_projet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
   private  UserService userService;

    //@GetMapping("/")
    //public String hello(){
       // return "hello wordl";
    //}

    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getAll();
    }
    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getById(id);
    }
    @PostMapping("/user")
    public String saveUser(@RequestBody List<User> users){
        return userService.saveAll(users).toString();
    }


}
