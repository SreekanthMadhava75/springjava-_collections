package com.example.demo.ll;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
	 LinkedList<String> friends = new LinkedList<>();
	 
	 List<String> familyFriends = new ArrayList<>();
	 
	 public void linkedList(int index, String name) {
		 friends.add(index, name);
		 System.out.println(friends);
		 
	 }
	 
	 public void linkedListAddFirst(String name) {
		 friends.addFirst(name);
		 System.out.println(friends);
	 }
	 
	 public void linkedListAddLast(String name) {
		 friends.addLast(name);
		 System.out.println(friends);
	 }
	 
	 
	 
	 public void arrayList(String name) {
		 familyFriends.add(name);
	 }
	 

}
