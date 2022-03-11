package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date; 

@RestController
public class HelloController {

	int counter = 0;

	@GetMapping("/")
	public String index() {
		try {
        Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception ie) {}
		return "<html><body>"
		+"<p><b>Java Spring Boot Run #"+counter+++"</b>"
		+"\n\n"
		+"<input type=\"button\" style=\"background-color:LightGreen\" onclick=\"location.href=\'/\'\" value=\"Next\"/>"
		+"<p><b>"+new Date().toString()+"</b></body></html>\n\n"
		+"<p><input type=\"button\" style=\"background-color:#ff6347\" onclick=\"location.href=\'/reset\'\" value=\"Reset\"/>";
	}

	@GetMapping("/reset")
	public String reset() {
		counter = 0; 
		return index();
	}

}
