package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@RequestMapping("/myapp")
	public String home() {
		logger.info("Demo app root looger: response 200");
		return "Hello Docker World";
	}
	
	@RequestMapping("/produceerror")
	public String produceerror() {
		logger.error("Demo app root looger: response 500");
		return "Error response";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
