package com.buetbusexp.userservicebuetbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class UserservicebuetbusApplication {
//	@GetMapping("/message")
//public String message() {
//	return "Hello from User Service buet bus";
//}
	public static void main(String[] args) {
		SpringApplication.run(UserservicebuetbusApplication.class, args);
	}

}
