package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.User;

public interface UserService {
	
    User registerUser(User user);
    
    Optional<User> findByEmail(String email);
    
    List<User> getAllUsers();
    
    Optional<User> getUserById(Integer id);
    
    User updateUser(User user);
    
    void deleteUser(Integer id);
}