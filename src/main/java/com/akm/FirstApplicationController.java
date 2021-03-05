package com.akm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApplicationController 
{
	@RequestMapping(value = "/hello")
	   public String hello() {
	      return "Welcome to my First Spring Boot Application ";
	   }

}
