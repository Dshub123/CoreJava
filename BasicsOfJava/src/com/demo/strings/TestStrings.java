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
		
		/************** Finding a String Within Another String **************/
		//contains()
		String str1 = "Hello World";
		String str2 = "Hello";
		String str3 = "helLO";
		System.out.println(str1.contains(str2)); //prints true
		System.out.println(str1.contains(str3)); //prints false
		
		//indexOf()
		String s = "this is a long sentence";
		int i = s.indexOf('i'); 	// the first 'i' in String is at index 2
		int j = s.indexOf("long"); 	// the index of the first occurrence of "long" in s is 10
		int k = s.indexOf('z'); 	// k is -1 because 'z' was not found in String s
		int h = s.indexOf("LoNg");	 // h is -1 because "LoNg" was not found in String s
		System.out.println(i+", "+j+", "+k+", "+h);
		
		/************** String pool and heap storage ***********/
		String a = "alpha";
		 String b = "alpha";
		 String c = new String("alpha");
		 //All three strings are equivalent
		 System.out.println(a.equals(b) && b.equals(c));
		 //Although only a and b reference the same heap object
		 System.out.println(a == b);
		 System.out.println(a != c);
		 System.out.println(b != c);
		 
		 /************ Splitting Strings **************/
		 //using delimiter char
		 String lineFromCsvFile = "Mickey;Bolton;12345;121216";
		 String[] dataCells = lineFromCsvFile.split(";");
		 // Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};
		 
		 //using regular exp
		 String lineFromInput = "What do you need from me?";
		 String[] words = lineFromInput.split("\\s+"); // one or more space chars
		 // Result is words = {"What", "do", "you", "need", "from", "me?"};
		 
		 
		 /************ Joining Strings with a delimiter ************/
		 String[] elements = { "foo", "bar", "foobar" };
		 String singleString = String.join(" + ", elements);
		 System.out.println(singleString); // Prints "foo + bar + foobar"
		 
		 //Concat method
		 String string1 = "Hello ";
		 String string2 = "world";
		 String string3 = string1.concat(string2); // "Hello world"
		 System.out.println(string3);
		 
		 /************** Replacing parts of Strings ***********/
		 String s1 = "popcorn";
		 System.out.println(s1.replace('p','W'));
		 
		 String s2 = "metal petal et al.";
		 System.out.println(s2.replace("etal","etallica"));

	}

}
