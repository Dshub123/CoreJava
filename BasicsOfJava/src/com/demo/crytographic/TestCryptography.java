package com.demo.crytographic;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

public class TestCryptography {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		//Reading data from user
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the message");
	      String message = sc.nextLine();
		  
	      //Creating the MessageDigest object  
	      MessageDigest md = MessageDigest.getInstance("SHA-256");

	      //Passing data to the created MessageDigest Object
	      md.update(message.getBytes());
	      
	      //Compute the message digest
	      byte[] digest = md.digest();      
	      System.out.println(digest);  
	     
	      //Converting the byte array in to HexString format
	      StringBuffer hexString = new StringBuffer();
	      
	      for (int i = 0;i<digest.length;i++) {
	         hexString.append(Integer.toHexString(0xFF & digest[i]));
	      }
	      System.out.println("Hex format : " + hexString.toString()); 

	      
//	      final byte[] sample = new byte[16];
//	      new SecureRandom().nextBytes(sample);
//	      System.out.println("Sample: " + DatatypeConverter.printHexBinary(sample));
	      
	    // Generate Public / Private Key Pairs
	      final KeyPairGenerator dhGenerator = KeyPairGenerator.getInstance("DiffieHellman");
	      final KeyPairGenerator dsaGenerator = KeyPairGenerator.getInstance("DSA");
	      final KeyPairGenerator rsaGenerator = KeyPairGenerator.getInstance("RSA");
	      dhGenerator.initialize(1024);
	      dsaGenerator.initialize(1024);
	      rsaGenerator.initialize(2048);
	      final KeyPair dhPair = dhGenerator.generateKeyPair();
	      final KeyPair dsaPair = dsaGenerator.generateKeyPair();
	      final KeyPair rsaPair = rsaGenerator.generateKeyPair();
	      System.out.println(dhPair.toString());
	      System.out.println(dsaPair);
	      System.out.println(rsaPair);


	}

}
