package com.example.demo.que;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	 Queue<String> waitingQueue = new LinkedList<>();
	 
	 public void addNames(String name) {
		 waitingQueue.add(name);
	 }
	 
	 // Removing an element from the Queue using remove() (The Dequeue operation)
     // The remove() method throws NoSuchElementException if the Queue is empty
	 
	 public void removeName() {
		 waitingQueue.remove();
		
	 }
	 
	 public void simfor() {
		 waitingQueue.forEach(name -> {System.out.println(name);});
	 }
	 
	// Removing an element from the Queue using poll()
     // The poll() method is similar to remove() except that it returns null if the Queue is empty.
	 
	 public void removepoll() {
		waitingQueue.poll();
	}

}
