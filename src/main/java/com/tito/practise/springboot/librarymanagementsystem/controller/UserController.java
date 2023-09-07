package com.tito.practise.springboot.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tito.practise.springboot.librarymanagementsystem.entity.User;
import com.tito.practise.springboot.librarymanagementsystem.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@PostMapping
	public User addUser(@RequestBody User user) {
		return userService.save(user);
	}
}
