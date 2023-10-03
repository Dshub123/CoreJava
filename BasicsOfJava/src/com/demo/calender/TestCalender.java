package com.demo.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalender {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		Calendar gregorianCalendar = new GregorianCalendar();
		Calendar gregorianCalendarAtSpecificDay = new GregorianCalendar(2016, Calendar.JANUARY, 1);
		Calendar gregorianCalendarAtSpecificDayAndTime = new GregorianCalendar(2016, Calendar.JANUARY, 1,
		6, 55, 10);
		
		System.out.println(calendar);
		System.out.println(gregorianCalendar);
		System.out.println(gregorianCalendarAtSpecificDay);
		System.out.println(gregorianCalendarAtSpecificDayAndTime);
		
		Calendar calendar2 = new GregorianCalendar(2016, Calendar.MARCH, 31); // 31 March 2016
		System.out.println(calendar2.get(2));
	}

}
