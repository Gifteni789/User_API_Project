package com.example.api_test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.*;
import java.util.ArrayList.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    private String marriageStatus;
    private String religion;
    private String language;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
