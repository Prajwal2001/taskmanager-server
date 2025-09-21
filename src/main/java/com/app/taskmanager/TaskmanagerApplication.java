package com.app.taskmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerApplication.class, args);

		Logger logger = LoggerFactory.getLogger(TaskmanagerApplication.class);
		logger.info("Task Manager Application Started Successfully in INFO log level.");
		logger.debug("Debugging information for Task Manager Application.");
		logger.error("This is an error message for Task Manager Application.");
		logger.warn("This is a warning message for Task Manager Application.");
		logger.trace("This is a trace message for Task Manager Application.");
	}

}
