package com.example.demo.que;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSizeSearchFrontExample {
	 Queue<String> waitingQueue = new LinkedList<>();
	 
	 public void addNames(String name) {
		 waitingQueue.add(name);
	 }
	 
	// Check if the Queue contains an element
	 
	 public void searchName(String name) {
		 waitingQueue.contains(name);
		 if (waitingQueue.contains(name)) {
			 System.out.println("WaitingQueue contains " + name);
		} else {
			System.out.println("Waiting Queue doesn't contain " + name);

		}
	 }
	 
	// Get the element at the front of the Queue without removing it using element()
     // The element() method throws NoSuchElementException if the Queue is empty
	 
	 public void searchEle() {
		 String firstPersonInTheWaitingQueue =  waitingQueue.element();
		 System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);
	 }
	 
	 public void pee() {
		// Get the element at the front of the Queue without removing it using peek()
	        // The peek() method is similar to element() except that it returns null if the Queue is empty
		 String firstPersonInTheWaitingQueue = waitingQueue.peek();
	        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

	 }

}
