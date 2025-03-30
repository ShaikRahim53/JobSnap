package com.dropresume.dropresume_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DropresumeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DropresumeBackendApplication.class, args);
	}

}

@RestController
@RequestMapping("/api")
class TestController{
	@GetMapping("/hello")
	public String sayHello()
	{
		return "DropResume Backend is Working!!!";
	}
}