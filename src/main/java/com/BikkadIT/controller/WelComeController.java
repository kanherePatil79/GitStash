package com.BikkadIT.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WelComeController {
	@GetMapping("/welcome")
	public String Welcome() {
		
		String msg="Welcome to Kanhere Construction";
		return null;
		
	}
	
		
	

}
