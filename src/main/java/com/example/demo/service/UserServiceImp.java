package com.example.demo.service;

import com.example.demo.model.AppUser;
import com.example.demo.model.UserRole;
import com.example.demo.repository.RoleRepo;
import com.example.demo.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor @Slf4j
public class UserServiceImp implements IUserService{
  private final UserRepo userRepo;
  private final RoleRepo roleRepo;

    @Override
    public AppUser saveUser(AppUser appUser) {
      log.info("Saving new User {}",appUser.getName());
       return userRepo.save(appUser);
    }

    @Override
    public UserRole saveRole(UserRole userRole) {
      log.info("Saving new {}",userRole.getUsername());
        return roleRepo.save(userRole);
    }

    @Override
    public void addRoleToUser(String userName, String UserRole) {
      log.info("Adding role {} to user {}",userName,UserRole);
AppUser appUser=userRepo.findByUsername(userName);
UserRole userRole=roleRepo.findByName(UserRole);
appUser.getRoles().add(userRole);

    }

    @Override
    public AppUser getUser(String username) {
      log.info("fetching {} to user {}",username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUser() {
      log.info("Fetching all users");
        return userRepo.findAll();

    }
}
