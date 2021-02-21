package com.mark.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingController {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApplication.class, args);
	}
	@RequestMapping("/coding")
	public String routeOne() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String routeTwo() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String routeThree() {
		return "Java/Spring is better!";
	}
	@RequestMapping("/{location}")
	public String routeFour(@PathVariable("location") String place) {
		return "The " + place + " is awesome!";
	}
	@RequestMapping("/{dojo}-dojo")
	public String routeFive(@PathVariable("dojo") String dojo) {
		switch (dojo) {
		
		case "burbank": return "Burbank Dojo is located in Southern California";
//		for bravity there is only on case... :)
		
		
		default: return "please check your spelling.";
		
		}
	}

}
