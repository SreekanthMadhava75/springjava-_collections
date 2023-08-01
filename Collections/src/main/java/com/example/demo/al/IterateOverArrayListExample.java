package com.example.demo.al;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {

	 List<String> tvShows = new ArrayList<>();

	 public void addShows(String shows) {
		 tvShows.add(shows);
	 }
	 
	 public void forEac() {
		 System.out.println("=== Iterate using Java 8 forEach and lambda ===");
		 tvShows.forEach(tvShow -> {
			 System.out.println(tvShow);
		 });
	 }
	 
	 Iterator<String> tvShowIterator = tvShows.iterator();
	 
	 public void iter() {
		 System.out.println("\n=== Iterate using an iterator() ===");
		 while (tvShowIterator.hasNext()) {
			 String tvShow = tvShowIterator.next();
			 System.out.println(tvShow);
			
			
		}
	 }
	 
	 public void forremaining() {
		 System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
		 tvShowIterator = tvShows.iterator();
		 tvShowIterator.forEachRemaining(tvShow -> {
			 System.out.println(tvShow);
		 });
	 }
	 
	 public void listIter() {
		 System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
		 // Here, we start from the end of the list and traverse backwards.
		 ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
		 while (tvShowListIterator.hasPrevious()) {
			String string = tvShowListIterator.previous();
			System.out.println(string);
			
		}
	 }
	 
	 public void simpleForEach() {
		 for (String string : tvShows) {
			 System.out.println(tvShows);
		}
	 }
	 
	 public void simpleFor() {
		 for (int i = 0; i < tvShows.size(); i++) {
			System.out.println(tvShows.get(i));
		}
	 }
	 
}
