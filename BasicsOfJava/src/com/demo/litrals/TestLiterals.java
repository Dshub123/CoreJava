package com.demo.litrals;

public class TestLiterals {

	public static void main(String[] args) {
		
		/*************Using Underscore Literals*************/
		
		int i1 = 123456;
		int i2 = 123_456;
		System.out.println(i1 == i2); // true
		
		byte color = 1_2_3;
		System.out.println(color);
		short yearsAnnoDomini= 2_016;
		System.out.println(yearsAnnoDomini);
		int socialSecurtyNumber = 999_99_9999;
		System.out.println(socialSecurtyNumber);
		long creditCardNumber = 1234_5678_9012_3456L;
		System.out.println(creditCardNumber);
		float piFourDecimals = 3.14_15F;
		System.out.println(piFourDecimals);
		double piTenDecimals = 3.14_15_92_65_35;
		System.out.println(piTenDecimals);
		
		/*************Hexadecimal, Octal and Binary literals*************/
		
		int dec = 110; 				// no prefix --> decimal literal
		int bin = 0b1101110; 		// '0b' prefix --> binary literal
		int oct = 0156; 			// '0' prefix --> octal literal
		int hex = 0x6E; 			// '0x' prefix --> hexadecimal literal
		int a = 0100; 				// Instead of 100, a == 64
		System.out.println(dec+", "+bin+", "+oct+", "+hex+", "+a);
		
		/*************String literals*************/
		
		String b = "Hello world"; 		// A literal denoting an 11 character String
		String c = ""; 					// A literal denoting an empty (zero length) String
		String d = "\""; 				// A literal denoting a String consisting of one
		 								// double quote character
		String r = "1\t2\t3\n"; 		// Another literal with escape sequences
		
		System.out.println(b+", "+c+", "+d+", "+r);
		
		/*************Character literals*************/
		
		char ab = 'a';
		char doubleQuote = '"';
		char singleQuote = '\'';
		
		System.out.println("Char literals: "+ab+", "+doubleQuote+", "+singleQuote);
	}

}
