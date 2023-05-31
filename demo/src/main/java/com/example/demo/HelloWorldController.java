package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping("/newyear")
	public String newYear() {
		return "Happy New Year";
	}
	
	@GetMapping("/happybirthday")
	public String happyBirthday() {
		return "Happy Birthday";
	}
	
}
