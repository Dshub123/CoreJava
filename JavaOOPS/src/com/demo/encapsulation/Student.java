package com.demo.encapsulation;


//this class student is an example of an encapsulation 
public class Student {
	
	//these are private information of student we dont expose these to anyone for that private 
	//access specifier is used.
	private String fisrtName;
	private String lastName;
	private int age;
	private String gender;
	
	//to access these hidden details one can use these getter and setter methods
	//these methods are public
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
