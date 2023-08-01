package com.example.demo.al;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedArrayListExample {
	 List<Integer> safeArrayList = Collections.synchronizedList(new ArrayList<>());
	 
	 public void addNum(int num){
		 safeArrayList.add(num);
		 
	 }
	 
	 public void syncArr() throws InterruptedException{
		 // Create a thread pool of size 10
	        ExecutorService executorService = Executors.newFixedThreadPool(10);

	        // Create a Runnable task that increments each element of the ArrayList by one
	        Runnable task = () -> {
	            incrementArrayList(safeArrayList);
	        };

	        // Submit the task to the executor service 100 times.
	        // All the tasks will modify the ArrayList concurrently
	        for(int i = 0; i < 100; i++) {
	            executorService.submit(task);
	        }

	        executorService.shutdown();
	        executorService.awaitTermination(60, TimeUnit.SECONDS);

	        System.out.println(safeArrayList);
		 
	 } 
	 
	  // Increment all the values in the ArrayList by one
	    private static void incrementArrayList(List<Integer> safeArrayList) {
	    	synchronized (safeArrayList) {
				for (int i = 0; i < safeArrayList.size(); i++) {
					  Integer value = safeArrayList.get(i);
					  safeArrayList.set(i, value + 1);
					
				}
			}
	    }

}
