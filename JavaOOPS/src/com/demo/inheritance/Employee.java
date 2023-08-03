package com.demo.inheritance;

//class employee is extending the person class 
public class Employee extends Person{
	
	//these properties are specific to the employee
	private String desc;
	private double salary;
	
	public Employee(String name, String gender, int age, String desc, double sal)
	{
		//super class constructor is called using super keyword and passed those properties
		super(name,gender,age); //these are properties of person class which are inherited and common in every person
		this.desc = desc;
		this.salary = sal;
	}

	@Override
	public String toString() {
		return "Employee ["+super.toString()+", desc=" + desc + ", salary=" + salary + "]";
	}
	
	
}
