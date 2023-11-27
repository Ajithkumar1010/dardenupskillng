package com.example.springbootcrudmysql.controller;

import com.example.springbootcrudmysql.entity.User;
import com.example.springbootcrudmysql.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import org.springframework.web.bind.annotation.RequestBody;
@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;

    //build create user rest api

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser= userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    //build get user by id rest api

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById (@PathVariable("id") Long userId){
        User User= userService.getUserById(userId);
        return new ResponseEntity<>(User, HttpStatus.OK);
    }

    //build get all user by rest api

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers (){
        List<User> users= userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //build update user by rest api

    @PutMapping("{id}")
    public ResponseEntity<User> UpdateUser ( @PathVariable("id") Long userId,
                                             @RequestBody User user){
        user.setId(userId);
        User updatedUser= userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    //build delete user by rest api

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser ( @PathVariable("id") Long userId){

        userService.deleteUser(userId);
        return new ResponseEntity<>("user successfully deleted",HttpStatus.OK);
    }

}
