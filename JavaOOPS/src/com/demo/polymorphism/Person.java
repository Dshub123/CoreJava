package com.demo.polymorphism;

//this is parent class person
public class Person {

	//this method takes name as a input and return some message.
	//this method is of person class
	public String getMessage(String name) {
		return "Hello Person "+name;
	}

	//this method is abstract because this method do not have body
	//which ever class is inheriting this class must have to override this method 

	//public abstract void calculateAge(int birthyear);

}
