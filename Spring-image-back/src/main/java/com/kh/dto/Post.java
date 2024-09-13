package com.kh.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

	private int id;
	private String title;
	private String content;
	private String imageUrl;
	private String createAt;
}
