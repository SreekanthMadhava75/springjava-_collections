package com.example.demo.al;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSortExample {
	private List<Person> people = new ArrayList<>();
	public void addPerson(String name, Integer age) {
        getPeople().add(new Person(name, age));
    }
	
	
	public List<Person> getPeople() {
		return people;
	}


	public void setPeople(List<Person> people) {
		this.people = people;
	}


//	class AgeComparator implements Comparator<Person> {
//	    @Override
//	    public int compare(Person person1, Person person2) {
//	        // Compare the ages of the two persons
//	        return Integer.compare(person1.getAge(), person2.getAge());
//	    }
//	}
	
	public void sortPeopleByAge() {
        Collections.sort(people, new AgeComparator());
    }
	

}
