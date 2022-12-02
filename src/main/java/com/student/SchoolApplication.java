package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SchoolApplication {

//	logger
	private static final Logger logger = LoggerFactory.getLogger(SchoolApplication.class);

	public static void main(String[] args) {
		logger.info("***********************************************************Starting the application");
		logger.info("***********************************************************Starting the application");
		logger.info("***********************************************************Starting the application");

		SpringApplication.run(SchoolApplication.class, args);
	}

}
