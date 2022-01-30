package com.example.demo.service;

import com.example.demo.model.AppUser;
import com.example.demo.model.UserRole;

import java.util.List;

public interface IUserService {
    AppUser saveUser(AppUser appUser);
    UserRole saveRole(UserRole userRole);
    void addRoleToUser(String user,String role);
    AppUser getUser(String username);
    List<AppUser> getUser();
}
