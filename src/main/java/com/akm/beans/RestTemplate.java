package com.akm.beans;

import org.springframework.context.annotation.Bean;

public class RestTemplate 
{
	
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
