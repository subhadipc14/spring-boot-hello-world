package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
	
	 @GetMapping("/")
		public String home() {
			return "Azure devops classes";
			
		}


    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
    
   
}
