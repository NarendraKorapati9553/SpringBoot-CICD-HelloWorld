package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		
		return "Hello World ....Lets Start CICD";
	}
}
