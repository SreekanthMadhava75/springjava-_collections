package com.example.demo.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
	 Set<String> daysOfWeek = new HashSet<>();
	 
	 public void addWeeks() {
		 // Adding new elements to the HashSet
	        daysOfWeek.add("Monday");
	        daysOfWeek.add("Tuesday");
	        daysOfWeek.add("Wednesday");
	        daysOfWeek.add("Thursday");
	        daysOfWeek.add("Friday");
	        daysOfWeek.add("Saturday");
	        daysOfWeek.add("Sunday");

	        // Adding duplicate elements will be ignored
	        daysOfWeek.add("Monday");
	 }
	 
	 public void simFor() {
		 daysOfWeek.forEach(s -> {System.out.println(s);});
	 }

}
