package com.coforge.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//starting point of the application. - has the main class.
//@SpringBootApplication is the annotation used to specify the main class.

@SpringBootApplication
public class SbEmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbEmsApplication.class, args);
	}

}
