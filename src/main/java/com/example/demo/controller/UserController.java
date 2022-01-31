package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class UserController {

private  final IUserService userService;


@GetMapping(path = "/user")
public ResponseEntity<List<AppUser>> getUsers(){
       return ResponseEntity.ok(userService.getUser());
}

}
