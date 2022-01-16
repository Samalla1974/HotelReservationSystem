package com.bridgelabz.workShop2;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.ChronoField;

public class HotelReservationSystem {
 
	public  void cheapestRateGivenDate() {
		System.out.println("Welcome to Hotel Reservation System");
		 HashMap<String, Integer> map = new HashMap<>();
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter  1 for weekdays or 2 weekends");
		 int day =sc.nextInt();
		 
		 if(day == 1)
		 {
			 System.out.println("for weekdays");
	        System.out.println(day);
		 map.put("Lakewood", 110);
		 map.put("Bridgewood", 120);
		 map.put("Ridgewood", 160);
		 System.out.println(map);
		 }
		 if(day == 2)
		 {
			 System.out.println("for weekends");
			 System.out.println(day);
			 map.put("Lakewood", 90);
			 map.put("Bridgewood", 60);
			 map.put("Ridgewood", 150);
			 System.out.println(map);
		 }
		 System.out.println("Hotels Rating");
		 map.put("Lakewood", 3);
		 map.put("Bridgewood", 4);
		 map.put("Ridgewood", 5);
		 System.out.println(map);
		
		int cr,cheapestrate;
		int r1=map.get("Lakewood");
		int r2=map.get("Bridgewood");
		int r3=map.get("Ridgewood");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		if(r2 < r1  ) {
			 cr =r2;
			 System.out.println(cr);
		{
		cr = r1;
		System.out.println(cr);
			 }
		if(cr < r3) {
			cheapestrate = cr;
		System.out.println(cr);
		}
		else
		{
		cheapestrate = r3;
		System.out.println(r3);
		}			
		HotelReservationSystem gd = new HotelReservationSystem();
		LocalDate ld1 = LocalDate.of(2020,10,10);
		System.out.println(ld1);		 
		LocalDate ld2 = LocalDate.of(2020,10,11);
		System.out.println(ld2);		 
		DayOfWeek day1 = DayOfWeek.of(ld1.get(ChronoField.DAY_OF_WEEK));
		DayOfWeek day2 = DayOfWeek.of(ld2.get(ChronoField.DAY_OF_WEEK));
		System.out.println(day1);	
		System.out.println(day2);
		System.out.println("cheapest rate on"+day1  +cheapestrate);
		System.out.println("cheapest rate on"+day2  +cheapestrate);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelReservationSystem hrs =  new HotelReservationSystem();
			hrs.cheapestRateGivenDate();
	}
}


