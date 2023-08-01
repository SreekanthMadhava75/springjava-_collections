package com.example.demo.que;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterateOverQueueExample {
	 Queue<String> waitingQueue = new LinkedList<>();
	 
	 public void addNames(String name) {
		 waitingQueue.add(name);
	 }
	 
	 //"=== Iterating over a Queue using Java 8 forEach() ==="
	 
	 public void simFor() {
		 waitingQueue.forEach(name -> { System.out.println(name);});
	 }
	 
	 Iterator<String> waitingQueueIterator = waitingQueue.iterator();
	 
	 //"\n=== Iterating over a Queue using iterator() ==="
	 
	 public void whileIter() {
		 while (waitingQueueIterator.hasNext()) {
			String string =  waitingQueueIterator.next();
			System.out.println(string);
			
		}
	 }
	 
	 //"\n=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ==="
	 
	 public void forEacRe() {
		 waitingQueueIterator.forEachRemaining(name -> System.out.println(name));
	 }

}