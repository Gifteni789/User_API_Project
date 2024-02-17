package com.example.api_test.repository;

import com.example.api_test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_repository extends JpaRepository <User, Long> {
}
