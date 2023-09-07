package com.tito.practise.springboot.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.practise.springboot.librarymanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
