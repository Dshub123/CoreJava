package com.demo.characterencoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingUTF8TextFile {

	public static void main(String[] args) throws IOException {

		//StandardCharsets is available since Java 1.7
		//for ealier version use Charset.forName("UTF-8");
		try (BufferedWriter wr = Files.newBufferedWriter(Paths.get("test.txt"),
				StandardCharsets.UTF_8)) {
			wr.write("Strange cyrillic symbol Ы");
		}
		/* First Way. For big files */
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("test.txt"),
				StandardCharsets.UTF_8)) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.print(line);
			}
		}

		System.out.println(); //just separating output

		/* Second way. For small files */
		String s = new String(Files.readAllBytes(Paths.get("test.txt")), StandardCharsets.UTF_8);
		System.out.print(s);
	}

}
