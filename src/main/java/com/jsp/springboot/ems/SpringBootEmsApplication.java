package com.jsp.springboot.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jsp.springboot.ems")

public class SpringBootEmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmsApplication.class, args);
		
	}

}
