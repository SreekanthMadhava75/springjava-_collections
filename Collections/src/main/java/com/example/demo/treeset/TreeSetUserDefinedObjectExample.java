package com.example.demo.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetUserDefinedObjectExample {

	static class Employee{
		 	private int id;
		    private String name;
		    
		    public Employee(int id, String name) {
		        this.id = id;
		        this.name = name;
		    }

		    public int getId() {
		        return id;
		    }

		    public void setId(int id) {
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
		        return "Employee{" +
		                "id=" + id +
		                ", name='" + name + '\'' +
		                '}';
		    }
		    
		    
	}
	
	SortedSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
	});
	
	public void addEmps(int id, String name) {
		Employee e = new Employee(id, name);
		employees.add(e);
	}
	
	public void addEmp() {
		addEmps(1010, "Rajeev");
		addEmps(1005, "Sachin");
		addEmps(1008, "Chris");
	}
	
	public void simFor() {
		employees.forEach(e -> {System.out.println(e);});
	}
}
