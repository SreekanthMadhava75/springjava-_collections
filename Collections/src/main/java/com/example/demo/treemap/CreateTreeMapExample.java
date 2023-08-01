package com.example.demo.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapExample {
	 SortedMap<String, String> fileExtensions  = new TreeMap<>();
	 
	 public void addKeyValues() {
		 fileExtensions.put("python", ".py");
	        fileExtensions.put("c++", ".cpp");
	        fileExtensions.put("kotlin", ".kt");
	        fileExtensions.put("golang", ".go");
	        fileExtensions.put("java", ".java");
	        
		
	 }
	 
	 public void print() {
//		 for (String key : fileExtensions.keySet()) {
//	            System.out.println("Extension: " + key + ", File Type: " + fileExtensions.get(key));
//	        }
		 // lambda expression
		 fileExtensions.forEach((key, value) -> {System.out.println(key + value);});
		 
	 }
	 
	 

}
