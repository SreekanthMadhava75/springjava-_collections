package com.example.demo.pqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorExample {
//	 Comparator<String> stringLengthComparator = new Comparator<String>() {
//
//		@Override
//		public int compare(String o1, String o2) {
//			// TODO Auto-generated method stub
//			return o1.length() - o2.length();
//		}
//		 
//	 };
	 
	 // The above Comparator can also be created using lambda expression like this =>
	 Comparator<String> stringLengthComparator = (o1, o2) -> {return o1.length() - o2.length(); };
	 
	// Create a Priority Queue with a custom Comparator
     PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

     public void nameAdd(String name) {
    	 namePriorityQueue.add(name);
	}
     
     // // Remove items from the Priority Queue (DEQUEUE)
     
     public void removeItem() {
    	 while (!namePriorityQueue.isEmpty()) {
    		 namePriorityQueue.remove();
    		 
			
		}
     }
	 

}
