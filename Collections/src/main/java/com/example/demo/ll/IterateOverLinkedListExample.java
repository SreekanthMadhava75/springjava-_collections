package com.example.demo.ll;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateOverLinkedListExample {
	 LinkedList<String> humanSpecies = new LinkedList<>();
	 
	 public void addNames(String name) {
		 humanSpecies.add(name);
	 }
	 
	 public void forEac() {
		 humanSpecies.forEach(name -> {
	            System.out.println(name);
	        });
		 }
	 
     Iterator<String> humanSpeciesIterator = humanSpecies.iterator();
     
     public void iter() {
    	 while (humanSpeciesIterator.hasNext()) {
			String string = humanSpeciesIterator.next();
			System.out.println(string);
		}
     }
     
     public void forEacRe() {
    	 humanSpeciesIterator.forEachRemaining(speciesName -> {
    		 System.out.println(speciesName);
    	 });
     }
     
     //"\n=== Iterate over a LinkedList using descendingIterator() ===
     Iterator<String> descendingHumanSpeciesIterator = humanSpecies.descendingIterator();
     
     public void descOrder() {
    	 while (descendingHumanSpeciesIterator.hasNext()) {
			String string = descendingHumanSpeciesIterator.next();
			System.out.println(string);
			
		}
    	 
     }
     
  // ListIterator can be used to iterate over the LinkedList in both forward and backward directions
     // In this example, we start from the end of the list and traverse backwards
     ListIterator<String> humanSpeciesListIterator = humanSpecies.listIterator(humanSpecies.size());
     public void forwardBackward() {
    	 while (humanSpeciesListIterator.hasPrevious()) {
    		 String string = humanSpeciesListIterator.previous();
    		 System.out.println(string);
			
		}
    	 
     }
     
     
     

}
