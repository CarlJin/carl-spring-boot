package com.ss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarlSpringBootApplication {
	static final Logger logger = LoggerFactory.getLogger(CarlSpringBootApplication.class);

	public static void main(String[] args) {
		logger.info("开始运行");
		SpringApplication.run(CarlSpringBootApplication.class, args);
	}
}
