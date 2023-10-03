package com.demo.fluentprogramming;

/**
 * In fluent programming style you return this from fluent (setter) methods that would return nothing in non-fluent
programming style.
 This allows you to chain the different method calls which makes your code shorter and easier to handle for the
developers.
 * 
 * **/
public class Person {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public Person withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Person withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public String whoAreYou() {
		return "I am " + firstName + " " + lastName;
	}


	public static void main(String[] args) {
		System.out.println(new Person().withFirstName("John")
				 .withLastName("Doe").whoAreYou());

	}

}
