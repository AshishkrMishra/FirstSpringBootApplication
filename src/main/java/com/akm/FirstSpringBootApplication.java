package com.akm;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootApplication  implements ApplicationRunner  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(FirstSpringBootApplication.class,args);

	}

	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Testing out  Application Runner ");
		
	}

}
