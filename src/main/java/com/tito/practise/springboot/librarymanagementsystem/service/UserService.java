package com.tito.practise.springboot.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tito.practise.springboot.librarymanagementsystem.entity.User;
import com.tito.practise.springboot.librarymanagementsystem.repository.UserRepository;

@Service
public class UserService {
 
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
}
