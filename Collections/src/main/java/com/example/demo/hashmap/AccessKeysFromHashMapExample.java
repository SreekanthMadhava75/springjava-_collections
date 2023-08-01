package com.example.demo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {
	Map<String, String> userCityMapping = new HashMap<>();
	
	public void addCity() {
		 userCityMapping.put("John", "New York");
	        userCityMapping.put("Rajeev", "Bengaluru");
	        userCityMapping.put("Steve", "London");
	}
	
	
	public void getUserCity(String name) {
		if (userCityMapping.containsKey(name)) {
			 // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(name);
            System.out.println(name + " lives in " + city);
			
		} else {
			 System.out.println("City details not found for user " + name);
		}
	}

}
