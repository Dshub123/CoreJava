package com.demo.dynamicmethoddispatch;

public class ClsRunTheApplication {

	public static void main(String[] args) {
		final String VIRUS_SCANNER_VERSION = "TRIAL_VERSION";
		//Parent Refers Null
		ClsVirusScanner objVS=null;
		//String Cases Supported from Java SE 7

		switch (VIRUS_SCANNER_VERSION){
		case "FREE_VERSION":
			//Parent Refers Child Object 3
			//ClsFreeVersion IS-A ClsVirusScanner
			objVS = new ClsFreeVersion(); //Dynamic or Runtime Binding
			break;
		case "PAID_VERSION":
			//Parent Refers Child Object 1
			//ClsPaidVersion IS-A ClsVirusScanner
			objVS = new ClsPaidVersion(); //Dynamic or Runtime Binding
			break;
		case "TRIAL_VERSION":
			//Parent Refers Child Object 2
			objVS = new ClsTrialVersion(); //Dynamic or Runtime Binding
			break;
		}
		//Method fnStartScan() is the Version of ClsTrialVersion()
		objVS.fnStartScan();


	}
}
