package com.demo.loggerservice;

import java.util.Iterator;
import java.util.ServiceLoader;

public class TestLoggerService {

	public static void main(String[] args) {
		final String message = "Hello World!";
		// get ServiceLoader for Logger
		ServiceLoader<Logger> loader = ServiceLoader.load(servicetest.Logger.class);
		// iterate through instances of available loggers, writing the message to each one
		Iterator<Logger> iterator = loader.iterator();
		while (iterator.hasNext()) {
			try (Logger logger = iterator.next()) {
				logger.log(message);
			}
		}


	}

}
