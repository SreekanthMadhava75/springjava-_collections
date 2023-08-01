package com.example.demo.al;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{

	 @Override
	    public int compare(Person person1, Person person2) {
	        // Compare the ages of the two persons
	        return Integer.compare(person1.getAge(), person2.getAge());
	    }
}
