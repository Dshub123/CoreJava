package com.demo.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		
		/******** A basic date output ********/
		//util date 
		Date d1 = new Date();
		System.out.println(d1);
		
		// define the format to use
		String formatString = "yyyy/MM/dd hh:mm.ss";
		
		// get a current date object
		Date date = Calendar.getInstance().getTime();
		
		// create the formatter
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
		
		// format the date
		String formattedDate = simpleDateFormat.format(date);
		
		// print it
		System.out.println(formattedDate);
		
		// single-line version of all above code
		System.out.println(new SimpleDateFormat("yyyy/MM/dd hh:mm.ss").format(Calendar.getInstance().getTime()));
		
		/**************Java 8 LocalDate and LocalDateTime objects***********/
		
		// Create a default date
		LocalDate lDate = LocalDate.now();
		System.out.println(lDate);
		
		// Creates a date from values
		lDate = LocalDate.of(2017, 12, 15);
		 
		// create a date from string
		lDate = LocalDate.parse("2017-12-15");
		
		// creates a date from zone
		LocalDate.now(ZoneId.systemDefault());
		
		// Create a default date time
		LocalDateTime lDateTime = LocalDateTime.now();
		System.out.println(lDateTime);
		// Creates a date time from values
		lDateTime = LocalDateTime.of(2017, 12, 15, 11, 30);
		
		// create a date time from string
		lDateTime = LocalDateTime.parse("2017-12-05T11:30:30");
		
		// create a date time from zone
		LocalDateTime.now(ZoneId.systemDefault());
		
		/******** Converting Date to a certain String *******/
		
		//Calender c = Calender.getInstance();
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy"); //pattern is specified here
		System.out.println(dateFormat.format(today)); //25-Feb-16
		
		//applyPattern()
		dateFormat.applyPattern("dd-MM-yyyy");
		System.out.println(dateFormat.format(today)); //25-02-2016
		dateFormat.applyPattern("dd-MM-yyyy HH:mm:ss E");
		System.out.println(dateFormat.format(today)); //25-02-2016 06:14:33 Thu
		
		/************  Converting String into Date ************/
		DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		String dateStr = "02/25/2016"; // input String
		Date date2 = dateFormat2
				.parse(dateStr);
		System.out.println(date2.getYear()); // 116
		
	}
}
