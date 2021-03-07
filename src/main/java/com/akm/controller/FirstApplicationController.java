package com.akm.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akm.models.RestUrlResponse;
import com.akm.repositories.RestUrlResponseRepository;

@RestController
public class FirstApplicationController 
{
	@Autowired
	RestUrlResponseRepository restUrlResponseRepository;
	
	@RequestMapping(value = "/hello")
	   public String hello() {
		
		RestUrlResponse restUrlResponse= restUrlResponseRepository.find("hello");
		if(Objects.nonNull(restUrlResponse))
		{
			return  restUrlResponse.getResponse();
		}else
		{
			return  "Nothing Configured yet";
		}
	   }
	
	@RequestMapping(value = "/bye")
	   public String bye() {
		
		RestUrlResponse restUrlResponse= restUrlResponseRepository.find("bye");
		if(Objects.nonNull(restUrlResponse))
		{
			return  restUrlResponse.getResponse();
		}else
		{
			return  "Nothing Configured yet";
		}
	   }

}
