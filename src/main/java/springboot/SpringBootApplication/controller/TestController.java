package springboot.SpringBootApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello Spring Boot";
	}
	

}
