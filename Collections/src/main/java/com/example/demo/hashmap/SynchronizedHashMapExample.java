package com.example.demo.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedHashMapExample {

	 Map<String, Integer> cricketTeamScore = Collections.synchronizedMap(new HashMap<>());
	 
	 public void addScore()  {
		 cricketTeamScore.put("Australia", 349);
	        cricketTeamScore.put("India", 250);
		 
	 }
	 
	 public void performConcurrentUpdates() throws InterruptedException {
	        ExecutorService executorService = Executors.newFixedThreadPool(10);

	        Runnable task = () -> {
	            incrementTeamScore(cricketTeamScore, "India");
	        };

	        for (int i = 0; i < 100; i++) {
	            executorService.submit(task);
	        }

	        executorService.shutdown();
	        executorService.awaitTermination(60, TimeUnit.SECONDS);
	    }
	 
	
     
     public static void incrementTeamScore(Map<String, Integer> cricketTeamScore, String team ) {
    	 synchronized (cricketTeamScore) {
    		 Integer score = cricketTeamScore.get(team);
    		 cricketTeamScore.put(team, score + 1);
			
		}
     }
}

