package com.demo.processes;

public class TestProcess {

	public static void main(String[] args) {
		Process p = Runtime.exec("mkdir /tmp/testDir");
		p.waitFor();
		if (p.exitValue() == 0) {
		 System.out.println("created the directory");
		}


	}

}
