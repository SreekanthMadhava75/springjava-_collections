package com.example.demo.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDescendingOrderExample {
	 //SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
	 
	
	 
	 SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		 
	 });
	 
	 
	 public void addFruits(String name) {
		 String s = new String(name);
		 fruits.add(s);
	 }
	 
	 public void addFruit() {
		 addFruits("Apple");
		 addFruits("Banana");
		 addFruits("CNC");
		 addFruits("Dragon");
	 }
	 
	 public void simFor() {
		 fruits.forEach(s -> System.out.println(s));
	 }
	 

}
