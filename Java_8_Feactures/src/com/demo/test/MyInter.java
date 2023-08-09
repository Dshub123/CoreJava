package com.demo.test;


//this is a functional interface
@FunctionalInterface
public interface MyInter {
	
	//we can declare variables in an interface in java 8
	public static final int x = 10;
	
	//only one abstract method
	void sayHello(String name);
	
	
	//we can write functions with implementation in java 8
	default int calculate(int num1,int num2) {
		return num1+num2;
	}
//	void sayBye();
}
