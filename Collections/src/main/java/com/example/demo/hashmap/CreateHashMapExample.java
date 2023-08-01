package com.example.demo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
	  Map<String, Integer> numberMapping = new HashMap<>();
	  
	  public void addNum() {
		  // Adding key-value pairs to a HashMap
	        numberMapping.put("One", 1);
	        numberMapping.put("Two", 2);
	        numberMapping.put("Three", 3);

	        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
	        numberMapping.putIfAbsent("Four", 4);
	  }
	  
	  public void simFor() {
		  numberMapping.forEach((key, value) -> {System.out.println(key + value);});
	  }

}
