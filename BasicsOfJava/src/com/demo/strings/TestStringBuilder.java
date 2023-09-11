package com.demo.strings;

import java.util.Arrays;

public class TestStringBuilder {

	public static void main(String[] args) {

		int one = 1;
		String color = "red";
		StringBuilder sb = new StringBuilder();
		sb.append("One=").append(one).append(", Color=").append(color).append('\n');
		System.out.print(sb);

		System.out.println(sb.capacity());;

		/********** Repeat a String n times *********/
		// Create a String containing n repetitions of a String s.

		final int n = 5;
		final String s = "Shubham";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			builder.append(s);
		}
		String result = builder.toString();
		System.out.println(result);

		/********************************************************/


		// Create a StringBuilder
		StringBuilder stringBuilder = new StringBuilder("Hello, ");

		// Append text to the StringBuilder
		stringBuilder.append("World!");
		System.out.println("Append: " + stringBuilder);

		// Insert text at a specific position
		stringBuilder.insert(7, "Java ");
		System.out.println("Insert: " + stringBuilder);

		// Replace a portion of the text
		stringBuilder.replace(0, 5, "Hi");
		System.out.println("Replace: " + stringBuilder);

		// Delete a portion of the text
		stringBuilder.delete(3, 6);
		System.out.println("Delete: " + stringBuilder);

		// Get the length of the StringBuilder
		int length = stringBuilder.length();
		System.out.println("Length: " + length);

		// Get the capacity of the StringBuilder
		int capacity = stringBuilder.capacity();
		System.out.println("Capacity: " + capacity);

		// Set the length of the StringBuilder
		stringBuilder.setLength(5);
		System.out.println("Set Length: " + stringBuilder);

		// Reverse the text
		stringBuilder.reverse();
		System.out.println("Reverse: " + stringBuilder);

		// Convert StringBuilder to a String
		result = stringBuilder.toString();
		System.out.println("Converted to String: " + result);



	}

}
