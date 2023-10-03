package com.demo.dynamicmethoddispatch;

public class ClsPaidVersion extends ClsVirusScanner{

	@Override
	public void fnStartScan() {
		super.fnCheckForUpdateVersion();
		super.fnBootTimeScan();
		super.fnInternetSecutiry();
		super.fnRealTimeScan();
		super.fnVirusMalwareScan();
	}
}; //ClsPaidVersion IS-A ClsVirusScanner

//Child Class 2
class ClsTrialVersion extends ClsVirusScanner{
	@Override
	public void fnStartScan() {
		super.fnInternetSecutiry();
		super.fnVirusMalwareScan();
	}
}; //ClsTrialVersion IS-A ClsVirusScanner

//Child Class 3
class ClsFreeVersion extends ClsVirusScanner{
	@Override
	public void fnStartScan() {
		super.fnVirusMalwareScan();
	}
}; //ClsTrialVersion IS-A ClsVirusScanner

