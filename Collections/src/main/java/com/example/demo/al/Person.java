package com.example.demo.al;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
	 	private String name;
	    private Integer age;
	    
	    public Person(String name, Integer age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Integer getAge() {
	        return age;
	    }

	    public void setAge(Integer age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	       
	    }
	    
}

 