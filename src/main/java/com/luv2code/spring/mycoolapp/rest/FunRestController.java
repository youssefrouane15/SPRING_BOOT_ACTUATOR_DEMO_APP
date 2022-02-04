package com.luv2code.spring.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${environment.mode}")
	private String envMode;
	
	@Value("${app.name}")
	private String appName;

	// expose "/" that returns a hello world

	@GetMapping("/")
	public String sayHello() {

		return "Hello World! Time on server is" + LocalDateTime.now();
	}
	
	// expose new endpoint for workout
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		
		return "Run a hard 5k!";
	}
	
	// expose new endpoint for fortune
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		
		return "Today is your lucky day";
	}
	
	// expose an endpoint that uses our injencted properties
	
	@GetMapping("/propertiesinfo")
	public String getPropertiesInfo() {
		
		return "App name: " + appName + "----Env Mode: " + envMode;
	}

}
