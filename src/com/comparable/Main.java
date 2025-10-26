package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	
	//Set<Employee> ts=new TreeSet<Employee>();
Set<Employee>ts=new HashSet<>();
	ts.add(new Employee(20,"Ak"));
	ts.add(new Employee(15,"Dk"));
	ts.add(new Employee(40,"Rk"));
	ts.add(new Employee(80,"fk"));
	ts.add(new Employee(90,"Mk"));
	//Collections.sort(ts);  we cant do this bcz set not support sort method 
	List<Employee> list = new ArrayList<>(ts);

	// Now sort the list
	Collections.sort(list);

	// Print
	list.forEach(System.out::println);
	
	ts.forEach(emp->System.out.println(emp));
	Comparator<Employee> sortByName = (e1, e2) -> e1.name.compareTo(e2.name);

	
}
}
