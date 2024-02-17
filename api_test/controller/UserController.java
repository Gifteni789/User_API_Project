package com.example.api_test.controller;

import com.example.api_test.model.User;
import com.example.api_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:63342")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
        return ResponseEntity.ok().body(userService.updateUser(id, user));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id, @RequestBody User user){
        return ResponseEntity.ok().body(userService.deleteUser(id, user));
    }

}
