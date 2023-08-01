package com.example.demo.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefinedObjectExample {
	static class Customer {
		private long id;
	    private String name;

	    public Customer(long id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    @Override
	    public String toString() {
	        return "Customer{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                '}';
	    }

	}
	
	 Set<Customer> customers = new HashSet<>();
	 
	 public void addCustmers(int id, String name) {
		 Customer c = new Customer(id, name);
		 customers.add(c);
	 }
	 
	 public void addCust() {
		 addCustmers(101, "Rajeev");
		 addCustmers(102, "Sachin");
		 addCustmers(103, "Chris");
	 }
	 
	 public void print() {
		 customers.forEach(f -> {System.out.println(f);});
	 }

}
