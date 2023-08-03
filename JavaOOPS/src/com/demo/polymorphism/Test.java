package com.demo.polymorphism;


//Class to perform polymorphism
public class Test {

	public static void main(String[] args) {
		
		//We cannot create person class object now because now it is abstract class
		//Person p = new Person(); 
		
		//but we can use reference of it
		Person per = new Employee();
		//per.calculateAge(1998);
		
		//solution for this is use of Interfaces
		//The class employee is extending person as well as implementing interface calculateAge
		//now I can create instance of person
		
		Employee e = new Employee();
		e.calculateAge(1997);
		
		
		
		//1) Compile this polymorphism
		sum(4,7.8f);
		
		
		//2)Runtime polymorphism
		//in runtime polymorphism both superclass and subclass contains same method
		//with same name and same signature
		//but which method is to be called is decided at runtime
		
		Employee emp = new Employee();
		Person p = new Employee();
	
		
		System.out.println(emp.getMessage("Shubham")); //this will call employee class method 
		
		System.out.println(p.getMessage("shubham")); //this will also call employee class method
		//though it has person class reference
		//here parent holding the child object is call UPCASTING
		
		
	}
	
	//Polymorphism are of two types:--
	
	//1) Compile time polymorphism
	//all the method have same name and same job but the signature of all these methods are different
	//this is called compile time polymorphism we can predict which method will be called at compile time
				public static void sum(int a,int b) {
					System.out.println(a+b);
				}
				
				public static void sum(int a,int b,int c) {
					System.out.println(a+b+c);
				}
				
				public static void sum(int a,float b) {
					System.out.println(a+b);
				}
				
				public static void sum(float a,int b) {
					System.out.println(a+b);
				}
				
				public static void sum(float a,float b) {
					System.out.println(a+b);
				}

}
