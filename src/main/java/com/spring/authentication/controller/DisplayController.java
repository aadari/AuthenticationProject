package com.spring.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DisplayController {

	@GetMapping("display")
	public String displayMessage() {
		return "Hello";
	}
}
