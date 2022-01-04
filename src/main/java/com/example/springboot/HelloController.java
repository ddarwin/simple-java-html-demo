package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date; 

@RestController
public class HelloController {

	int counter = 0;

	@GetMapping("/")
	public String index() {
		return "<html><body><p><b>Java Spring Boot Run #"+counter+++"</b><p><b>"+new Date().toString()+"</b></body></html>";
	}

}