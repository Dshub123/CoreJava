package com.demo.typeconversion;

public class TestTypeConversion {

	public static void main(String[] args) {
		
		//**********Implicit casting**********
		byte byteVar = 42;
		short shortVar = byteVar;
		int intVar = shortVar;
		long longVar = intVar;
		float floatVar = longVar;
		double doubleVar = floatVar;
		
		System.out.println(doubleVar);
		
		//**********Explicit casting**********
		
		 doubleVar = 42.0d;
		 floatVar = (float) doubleVar;
		 longVar = (long) floatVar;
		 intVar = (int) longVar;
		 shortVar = (short) intVar;
		 byteVar = (byte) shortVar;
		 
		 System.out.println(byteVar);
		 
		 //**********Basic Numeric Promosions**********
		 
		 char char1 = 1, char2 = 2;
		 short short1 = 1, short2 = 2;
		 int int1 = 1, int2 = 2;
		 float float1 = 1.0f, float2 = 2.0f;
		 // char1 = char1 + char2;                // Error: Cannot convert from int to char;
		 // short1 = short1 + short2;             // Error: Cannot convert from int to short;
		 int1 = char1 + char2;                    // char is promoted to int.
		 int1 = short1 + short2;                  // short is promoted to int.
		 int1 = char1 + short2;                   // both char and short promoted to int.
		 float1 = short1 + float2;                // short is promoted to float.
		 int1 = int1 + int2;                      // int is unchanged.
		 
		 System.out.println(int1);
		 System.out.println(float1);
		 
		 //**********Non-numeric primitive casting**********
		 
		 //int badInt = (int) true;                 // Compiler error: incompatible types
		 char1 = (char) 65; 						// A
		 byte byte1 = (byte) 'A'; 					// 65
		 short1 = (short) 'A'; 						// 65
		 int1 = (int) 'A'; 							// 65
		 char2 = (char) 8253; 						// ‽
		 byte byte2 = (byte) '‽'; 					// 61 (truncated code-point into the ASCII range)
		 short2 = (short) '‽'; 						// 8253
		 int2 = (int) '‽'; 							// 8253
		 
		 System.out.println(int2);
		 System.out.println(byte1);
		 System.out.println(byte2);
	}
}
