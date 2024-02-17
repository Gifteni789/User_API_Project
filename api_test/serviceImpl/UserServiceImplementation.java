package com.example.api_test.serviceImpl;

import com.example.api_test.model.User;
import com.example.api_test.repository.User_repository;
import com.example.api_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    User_repository user_repository;
    @Override
    public User registerUser(User user) {
         User.builder()
                 .age(user.getAge())
                 .email(user.getEmail())
                 .id(user.getId())
                 .firstName(user.getFirstName())
                 .gender(user.getGender())
                 .language(user.getLanguage())
                 .lastName(user.getLastName())
                 .marriageStatus(user.getMarriageStatus())
                 .religion(user.getReligion())
                .build();

        User SavedUser = user_repository.save(user);
        return SavedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return user_repository.findAll();
    }

    @Override
    public User updateUser(Long id, User user) {
        User updatedUser = user_repository.findById(id).orElseThrow(()-> new RuntimeException("Sorry This ID does not exist!"));
        updatedUser.setLanguage(user.getLanguage());
        updatedUser.setAge(user.getAge());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setGender(user.getGender());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setMarriageStatus(user.getMarriageStatus());
        updatedUser.setReligion(user.getReligion());

        user_repository.save(updatedUser);
        return updatedUser;
    }

    public String deleteUser(Long id, User user){
        User user1 = user_repository.findById(id).orElseThrow(()-> new RuntimeException("Sorry This ID does not exist!"));
        user_repository.delete(user1);
        return "Item has been deleted.";
    }
}
