package com.demo.polymorphism;

import java.time.Year;

//class employee is extending the person class 
public class Employee extends Person implements ICalculateAge{
	
	
	
	//this method takes name as a input and return some message.
	//this method is of employee class
	public String getMessage(String name) {
		return "Hello Employee "+name;
	}

	@Override
	public void calculateAge(int birthyear) {
		int age = Year.now().getValue() - birthyear;
		System.out.println("Your age is: "+age);
		
	}
	
	
}
