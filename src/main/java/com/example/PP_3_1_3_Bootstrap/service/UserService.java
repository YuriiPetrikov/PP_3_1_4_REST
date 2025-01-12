package com.example.PP_3_1_3_Bootstrap.service;

import com.example.PP_3_1_3_Bootstrap.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    User findUserById(long userId);
    List<User> getAllUsers();
    void updateUser(User user);
    void saveUser(User user);
    void deleteUser(long userId);
}
