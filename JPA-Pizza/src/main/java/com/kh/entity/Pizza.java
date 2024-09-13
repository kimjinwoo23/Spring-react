package com.kh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 db에 테이블을 연결할 경우 =dto 
  테이블이 존재하는지 알수없고 db와java에서 객체로사용한다는 entity
 
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pizza {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String description;
	private double price;
	
}




