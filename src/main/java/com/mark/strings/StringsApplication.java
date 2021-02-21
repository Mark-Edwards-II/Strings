package com.mark.strings;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {
	Random rand = new Random();

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	@RequestMapping("/")
	public String home() {
		return "Hello client! How are you today?";
	}
	@RequestMapping("/random")
	public String random() {
		String randy = "Spring Boot is great! so much fun!";
		for(int i = 0; i < 10;i++) randy += rand.nextInt(10);
		return randy;
	}

}
