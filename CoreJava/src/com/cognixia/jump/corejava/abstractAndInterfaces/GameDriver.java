package com.cognixia.jump.corejava.abstractAndInterfaces;

import java.time.*;
// depricated - no longer supported, so let's not use this one
import java.util.Date;

public class GameDriver {
	
	// enum - basic (not constructors)
	public enum Days {
		MON, TUES, WED, THURS, FRI, SAT, SUN
	}

	public static void main(String[] args) {
		
		// brief talk on local date, time, datetime and zoned time
		
		// the old one, don't use
		Date date;
		
		// THe good one!
		LocalDate date1 = LocalDate.of(2020, 10, 30);
		LocalDate date2 = LocalDate.of(2021, 1, 1);
		LocalDate date3 = LocalDate.now();
		
		//the .of() method is a static method of the class
		// it abstracts the constructor away from us so we
		// can get to building our objects with relvent data
		// sometimes faster or in a more controlled manner.
		
		// new LocalDate()
		System.out.println(date1);
		System.out.println(date1.isEqual(date3));
		System.out.println(date3);
		
		//Local Time
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		// LocalDateTime
		//LocalDateTime ldt1 = LocalDateTime.of(year, month, dayOfMonth, hour, minute)
		LocalDateTime ldt2 = LocalDateTime.of(date1, time1);
		System.out.println(ldt2);
		
		// showing the .of() static method to build objects
		// the constructor still must be used, but it's abstracted
		OddJob oj = OddJob.of("Hello");
		System.out.println(oj.message);
		
		// Zoned DateTime
		ZoneId zid = ZoneId.of("Europe/Paris");
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt2, zid);
		System.out.println(zdt1);
		
		Months month = Months.FEB;
		Days day = Days.FRI;
		System.out.println(month);
		

		
		switch(month) {
		case JAN: System.out.println("January");
		break;
		case FEB: System.out.println("Its cold");
		break;
		}
		
		// swap 2 ints without a temp variable 
		
		// this will be the only case where we 'hard code' assigning values
		int a = 5;
		int b = 10;
//		int temp = 0;
		
		// swapping with 3rd variable
//		temp = y;
//		y = x;
//		x = temp;
//		System.out.println("x= " + x + " y= " + y);
		
		
		// without the 3rd
		a = a + b;
		// a is now 15, b is still 10
		b = a - b;
		// b is now 5, a is 15;
		a = a - b;
		// a is now 10, b is now 5
		System.out.println("a=" + a + " b=" + b);
		
	}
	
	

}
