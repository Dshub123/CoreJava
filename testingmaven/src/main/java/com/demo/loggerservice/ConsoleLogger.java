package com.demo.loggerservice;



public class ConsoleLogger implements Logger{

	@Override
	public void close(){

	}

	@Override
	public void log(String message) {
		System.err.println(message);
	}

}
