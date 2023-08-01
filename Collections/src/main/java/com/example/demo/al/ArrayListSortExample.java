package com.example.demo.al;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
	  List<String> names = new ArrayList<>();
	  
	  public void nameAdd(String name) {
		  names.add(name);
		//  System.out.println("Sorted Names : " + names);
		  
	  }
	  
	  public List<String> getName() {
		  return names;
	  }
	  
	  public void setName(List<String> names) {
		  this.names = names;
	  }
	  
	  
	  
	// Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
	 public void sortNames() {
		 names.sort(new NameComparator());
		 //System.out.println("Sorted Names : " + names);
	 }
	 

}
