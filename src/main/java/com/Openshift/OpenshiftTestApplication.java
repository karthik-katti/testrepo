package com.Openshift;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftTestApplication.class, args);
	}
	
	@GetMapping("/testName")
	public String testmethod() {		
		return "This is test method up and running!!!!";
	}
	
	@GetMapping("/testName/{name}")
	public String testmethod1(@PathVariable("name") String name) {		
		return "hello"+name+"This is test method up and running!!!!"+"@"+new Date();
	}

}
