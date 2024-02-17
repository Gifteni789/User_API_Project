package com.example.api_test.service;

import com.example.api_test.model.User;

import java.util.List;

public interface UserService {
    User registerUser (User user);

    List<User> getAllUsers ();

    User updateUser (Long id, User user);

    String deleteUser(Long id, User user);
}
