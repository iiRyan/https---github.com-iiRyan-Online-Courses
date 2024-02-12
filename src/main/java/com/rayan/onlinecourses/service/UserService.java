package com.rayan.onlinecourses.service;

import com.rayan.onlinecourses.entity.User;

public interface UserService {

    User loadUserBuEmail(String email);

    User createUser(String email, String password);

    void assignRoleToUser(String email, String roleName);
}