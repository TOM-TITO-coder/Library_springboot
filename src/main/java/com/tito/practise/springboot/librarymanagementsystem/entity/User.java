package com.tito.practise.springboot.librarymanagementsystem.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
