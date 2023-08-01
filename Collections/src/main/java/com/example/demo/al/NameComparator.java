package com.example.demo.al;

import java.util.Comparator;

//public class NameComparator implements Comparator<String>{
//	public int compare(String s1, Strings2) {
//		return s1.compareTo(s2)
//	}
//
//}

public class NameComparator implements Comparator<String> {
    @Override
    public int compare(String name1, String name2) {
        // Use the String compareTo method to compare names
        return name1.compareTo(name2);
    }
}