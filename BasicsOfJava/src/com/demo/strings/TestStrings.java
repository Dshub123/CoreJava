package com.demo.strings;

public class TestStrings {

	public static void main(String[] args) {
		
		/***************String Compare***************/
		
		String strObj = new String("Hello!");
		String str = "Hello!";
		// The two string references point two strings that are equal
		if (strObj.equals(str)) {
		 System.out.println("The strings are equal");
		}
		// The two string references do not point to the same object
		if (strObj != str) {
		 System.out.println("The strings are not the same object");
		}
		// If we intern a string that is equal to a given literal, the result is
		// a string that has the same reference as the literal.
		String internedStr = strObj.intern();
		if (internedStr == str) {
		 System.out.println("The interned string and the literal are the same object");
		}
		
		/***************Changing the case of characters within a String***************/
		
		String string = "This is a Random String";
		String upper = string.toUpperCase();
		String lower = string.toLowerCase();
		System.out.println(string); 		// prints "This is a Random String"
		System.out.println(lower); 			// prints "this is a random string"
		System.out.println(upper); 			// prints "THIS IS A RANDOM STRING"
		
	}

}
