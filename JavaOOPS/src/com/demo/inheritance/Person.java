package com.demo.inheritance;

//this is parent class person
public class Person {
	
	//these are some common characteristics of person
	private String name;
	private String gender;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", age=" + age;
	}
	
	
	
}
