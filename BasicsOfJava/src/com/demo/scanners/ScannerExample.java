package com.demo.scanners;

import java.util.Scanner;

public class ScannerExample
{
	public static void main(String[] args) {


		Scanner scanner = null;
		try{
			scanner = new Scanner("i,like,unicorns").useDelimiter(",");;
			while(scanner.hasNext()){
				System.out.println(scanner.next());
			}

			String inputTaken = new String();
			while (true) {
				String input = scanner.nextLine(); // reading one line of input
				if (input.matches("\\s+")) // if it matches spaces/tabs, stop reading
					break;
				inputTaken += input + " ";
			}
			System.out.println(inputTaken);

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (scanner != null)
				scanner.close();
		}




	}
}

