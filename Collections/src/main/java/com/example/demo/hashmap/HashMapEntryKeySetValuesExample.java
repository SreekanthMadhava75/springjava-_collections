package com.example.demo.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {
	 Map<String, String> countryISOCodeMapping = new HashMap<>();
	 
	 public void addNations() {
		 countryISOCodeMapping.put("India", "IN");
	        countryISOCodeMapping.put("United States of America", "US");
	        countryISOCodeMapping.put("Russia", "RU");
	        countryISOCodeMapping.put("Japan", "JP");
	        countryISOCodeMapping.put("China", "CN");

	 }
	 
	 public void simFor() {
		 countryISOCodeMapping.forEach((key, value) -> {System.out.println(key + value);});
	 }
	 
	// HashMap's key set
	 public void simForKey() {
		 Set<String> countries = countryISOCodeMapping.keySet();
		 countries.forEach(l -> {System.out.println(l);});
	 }
	 
	// HashMap's values
	 
	 public void simForValues() {
		 Collection<String> isoCodes = countryISOCodeMapping.values();
		 isoCodes.forEach(l -> {System.out.println(l);});
}

} 
