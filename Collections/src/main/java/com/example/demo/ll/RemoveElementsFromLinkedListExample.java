package com.example.demo.ll;

import java.util.LinkedList;

public class RemoveElementsFromLinkedListExample {

	 LinkedList<String> programmingLanguages = new LinkedList<>();
	 
	 public void addNames(String name) {
		 programmingLanguages.add(name);
		 
	 }
	 
	 // Remove the last element in the LinkedList
	 
	 public void removeLast(String name) {
		 programmingLanguages.removeLast();
	 }
	 
	 // to print after remove elements
	 public void simFor() {
		 programmingLanguages.forEach(name ->{ System.out.println(name);});
	 }
	 
	 // Remove the first occurrence of the specified element from the LinkedList
	 
	 public void removeFromList(String name) {
		 boolean isRemoved = programmingLanguages.remove("java");
		 System.out.println("removed ele " + isRemoved);
	 }
	 
	 // Remove all the elements that satisfy the given predicate
	 public void removeEleStart(String name) {
		 programmingLanguages.removeIf(programmingLanguage -> programmingLanguage.startsWith("c"));
	 }
	 
	 
}
