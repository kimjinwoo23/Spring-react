package com.kh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.dto.NaverUser;
import com.kh.service.NaverUserService;

@RestController
public class NaverRegistController {

	@Autowired
	private NaverUserService naverUserService;
	
	@PostMapping("/naverAPI/register")
	public String insertNaverUser(@RequestBody NaverUser naverUser) {
		naverUserService.insertNaverUser(naverUser);
		
		return "Naver API";
	}
	
}
