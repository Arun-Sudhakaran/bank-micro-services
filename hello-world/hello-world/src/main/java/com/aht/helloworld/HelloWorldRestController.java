package com.aht.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/aht")
public class HelloWorldRestController {

	@GetMapping(value = "/hello-world")
	public String greetings() {
		
		return "Hello and welcome to my first microservice spring boot project";
	}
}
