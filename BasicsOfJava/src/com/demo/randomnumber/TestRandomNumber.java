package com.demo.randomnumber;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class TestRandomNumber {

	public static void main(String[] args) {

		Random random = new Random();
		int randInt = random.nextInt();
		System.out.println(randInt);

		long randLong = random.nextLong();
		System.out.println(randLong);

		double randDouble = random.nextDouble(); //This returns a value between 0.0 and 1.0
		System.out.println(randDouble);

		float randFloat = random.nextFloat(); //Same as nextDouble
		System.out.println(randFloat);

		byte[] randBytes = new byte[16];
		random.nextBytes(randBytes); 


		random.nextInt(1000); // 0 - 999
		int number = 10 + random.nextInt(100); // number is in the range of 10 to 109
		System.out.println(number);

		/********  Generating cryptographically secure pseudorandom numbers ***********/

		SecureRandom rng = new SecureRandom();
		byte[] randomBytes = new byte[64];
		rng.nextBytes(randomBytes); // Fills randomBytes with random bytes (duh)
		System.out.println(Arrays.toString(randomBytes));


	}

}
