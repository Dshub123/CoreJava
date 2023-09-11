package com.demo.bitmanipulation;

public class TestBitManipulation {

	public static void main(String[] args) {

		// Bitwise AND (&)
		int a = 12;  // Binary: 1100
		int b = 6;   // Binary:  0110
		int resultAnd = a & b;
		System.out.println("a & b = " + resultAnd);  // Output: 4 (Binary: 0100)

		// Bitwise OR (|)
		int resultOr = a | b;
		System.out.println("a | b = " + resultOr);  // Output: 14 (Binary: 1110)

		// Bitwise XOR (^)
		int resultXor = a ^ b;
		System.out.println("a ^ b = " + resultXor);  // Output: 10 (Binary: 1010)

		// Bitwise NOT (~)
		int resultNotA = ~a;
		System.out.println("~a = " + resultNotA);    // Output: -13 (Binary: 11111111111111111111111111110011)

		// Left Shift (<<)
		int leftShifted = a << 2;  // Shift left by 2 bits
		System.out.println("a << 2 = " + leftShifted);  // Output: 48 (Binary: 110000)

		// Right Shift (>>)
		int rightShifted = a >> 2;  // Shift right by 2 bits
		System.out.println("a >> 2 = " + rightShifted);  // Output: 3 (Binary: 0011)

		// Zero-fill Right Shift (>>>)
		int zeroFillRightShifted = -1 >>> 2;  // Zero-fill right shift by 2 bits
		System.out.println("-1 >>> 2 = " + zeroFillRightShifted);  // Output: 1073741823 (Binary: 00111111111111111111111111111111)


	}

}
