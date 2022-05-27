package com.sa.miniproject1.service;

import com.sa.miniproject1.model.Role;
import com.sa.miniproject1.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    //find user by username
    Optional<User> findByUsername(String username);

    //change user role
    void changeRole(Role newRole, String username);
}
