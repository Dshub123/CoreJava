package com.demo.operators;

public class Operators {
	
	public static void main(String[] args) {
		
		
		//1) Increment operator ++ and Decrement operator --
		int x = 4;
		x++; // post increment operator
		//System.out.println(x);
		x--; // post decrement operator
		//System.out.println(x);
		++x; // pre-increment operator
		//System.out.println(x);
		--x; //pre-decrement operator
		
		//2) Arithmetic Operators (+ , - , / , *)
		int a = 3;
		int b = 49;
		float c = 7.6f;
		float d = 9.88f;
		byte e = 49;
		//System.out.println(a+c);
		//System.out.println(a-e);
		//System.out.println(c/d);
		//System.out.println(e*d);
		
		
		//3) Relational Operators (< , > , <= , >= , == , !=) these all returns boolean value true or false 
		//System.out.println(a>b); //a is greater than b
		//System.out.println(c<d); //c is less than d
		//System.out.println(a>=b); //a is greater than or equal to b
		//System.out.println(c<=d); //c is less than or equal to d
		//System.out.println(e==b); //a equals b
		
		//4) instanceOf() Operators used to check the given object is of particular type
		Object obj = new Object();
		
		//5) Bit wise operator (& , | , ^)
		System.out.println(7&5); // and operator sum up all the bits of 7 and 5 if 1 & 0 = 0
		System.out.println(7|5); // or operator sum up individual bits of 7 and 5 if 1 | 0 = 1
		System.out.println(8^2); 
	}

}
