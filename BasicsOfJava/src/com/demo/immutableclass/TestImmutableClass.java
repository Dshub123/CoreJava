package com.demo.immutableclass;

public class TestImmutableClass {

	public static void main(String[] args) {
		
		Color c = new Color(1,34,56);
		Color cin = c.invert();
		
		System.out.println(c);
		System.out.println(cin);

	}

}
