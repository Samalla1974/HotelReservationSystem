package com.bridgelabz.workShop2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Scanner;

public class RewardCustomer {	
	public void rewardRates() {
		System.out.println("Welcome to Hotel Reservation System");
		 HashMap<String, Integer> map = new HashMap<>();
		 Scanner sc = new Scanner (System.in);
		 System.out.println("enter  1 for weekdays or 2 weekends");
		 int Rday =sc.nextInt();
		 
		 if(Rday == 1)
		 {
			 System.out.println("for weekdays");
	        System.out.println(Rday);
		 map.put("Lakewood", 110);
		 map.put("Bridgewood", 120);
		 map.put("Ridgewood", 160);
		 System.out.println(map);
		 }
		 if(Rday == 2)
		 {
			 System.out.println("for weekends");
			 System.out.println(Rday);
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
		 
		 int Rcr,Rcheapestrate;
			int Rr1=map.get("Lakewood");
			int Rr2=map.get("Bridgewood");
			int Rr3=map.get("Ridgewood");
			System.out.println(Rr1);
			System.out.println(Rr2);
			System.out.println(Rr3);
			if(Rr2 < Rr1  ) {
				 Rcr =Rr2;
				 System.out.println(Rcr);
			{
			Rcr = Rr1;
			System.out.println(Rcr);
				 }
			if(Rcr < Rr3) {
				Rcheapestrate = Rcr;
			System.out.println(Rcr);
			}
			else
			{
			Rcheapestrate = Rr3;
			System.out.println(Rr3);
			}			
			LocalDate Rld1 = LocalDate.of(2020,10,10);
			System.out.println(Rld1);		 
			LocalDate Rld2 = LocalDate.of(2020,10,11);
			System.out.println(Rld2);		 
			DayOfWeek Rday1 = DayOfWeek.of(Rld1.get(ChronoField.DAY_OF_WEEK));
			DayOfWeek Rday2 = DayOfWeek.of(Rld2.get(ChronoField.DAY_OF_WEEK));
			System.out.println(Rday1);	
			System.out.println(Rday2);
			System.out.println("cheapest rate on"+Rday1  +Rcheapestrate);
			System.out.println("cheapest rate on"+Rday2  +Rcheapestrate);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RewardCustomer rc =  new RewardCustomer();
		rc.rewardRates();
	}
}
