package com.demo.strings;

public class TestStringBuffer {

	public static void main(String[] args) {
		
		/*
		 *used to created mutable (modifiable) string.
		 *Mutable: Which can be changed.
		 *is thread-safe i.e. multiple threads cannot access it simultaneously.
		 */
		
		//All methods in the stringbuffer are syncronized
		
		/*
		 * public synchronized StringBuffer append(String s)
		 * public synchronized StringBuffer insert(int offset, String s)
		 * public synchronized StringBuffer replace(int startIndex, int endIndex, String str)
		 * public synchronized StringBuffer delete(int startIndex, int endIndex)
		 * public synchronized StringBuffer reverse()
		 * public int capacity()
		 * public void ensureCapacity(int minimumCapacity)
		 * public char charAt(int index)
		 * public int length()
		 * public String substring(int beginIndex)
		 * public String substring(int beginIndex, int endIndex)
        */
		
		String str = "study";
		 str.concat("tonight");
		 System.out.println(str); // Output: study
		 StringBuffer strB = new StringBuffer("study");
		 strB.append("tonight");
		 System.out.println(strB); // Output: studytonight
	}

}
