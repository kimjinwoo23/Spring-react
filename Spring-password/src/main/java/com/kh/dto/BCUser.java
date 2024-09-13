package com.kh.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class BCUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String username;
	private String email;
	private String password;
}
