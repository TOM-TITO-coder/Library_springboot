package com.tito.practise.springboot.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.practise.springboot.librarymanagementsystem.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
