package com.demo.reflectiondemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws Exception{


		Student std = new Student(1,"Raghav",13,"Pune");

		//this method returns all the fields inside student class
		Field [] stdFields = std.getClass().getDeclaredFields(); 

		//this will display all the fields
		for(Field f : stdFields) {
			System.out.println(f.getName());
		}

		//set method is used to set a value of particular field when it is private and setter method is present.
		for(Field f : stdFields) {
			if(f.getName().equals("name")) {
				f.setAccessible(true);        //this allow to access private fields inside the class.
				f.set(std, "John Miller");
			}
		}

		//System.out.println(std.getName()); 

		//To  get all methods inside student class
		 Method[] stdMethods = std.getClass().getDeclaredMethods();
		 
		 for(Method m : stdMethods) {
			 System.out.println(m.getName());
		 }
		 
		 //invoke method allows us to call methods inside student class
		 //this method takes two parameters object of class and method parameter if any
		 for(Method m : stdMethods) {
			if(m.getName().equals("display")) {
				m.setAccessible(true);          //this allows to call private methods. 
				m.invoke(std);  
			}
		 }
		 
		 

	}

}
