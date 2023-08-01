package com.example.demo.al;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionsSortExample {
	public void arrayListCollectionsSort() {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(13);
	        numbers.add(7);
	        numbers.add(18);
	        numbers.add(5);
	        numbers.add(2);
	        // before sort
	        System.out.println("befor :::"+numbers);
	        Collections.sort(numbers);
	        // after sort
	        System.out.println("After :::"+numbers);
	}

}
