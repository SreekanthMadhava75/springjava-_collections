package com.example.demo.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSetExample {

	 SortedSet<String> fruits = new TreeSet<>();
	 
	 public void addFruits(String name) {
		 String s = new String(name);
		 fruits.add(s);
		 
	 }
	 
	 public void addFruit() {
		 addFruits("Apple");
		 addFruits("Banana");
		 addFruits("Pineapple");
		 addFruits("Orange");
		
	 }
	 
	 public void simfor() {
		 fruits.forEach(n -> System.out.println(n));
	 }
}
