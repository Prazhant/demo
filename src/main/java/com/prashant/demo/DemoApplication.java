package com.prashant.demo;

import com.prashant.demo.Industry.IndustryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	@Autowired
	private IndustryRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
