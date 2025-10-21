package com.comparator.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	Comparator<Student> byName=(s1,s2) ->s1.getName().compareToIgnoreCase(s2.getName());
	Set<Student> ts=new TreeSet<>(byName);
	ts.add(new Student(50,"zk"));
	ts.add(new Student(40,"fk"));
	ts.add(new Student(60,"tk"));
	ts.add(new Student(20,"ek"));
	ts.add(new Student(90,"mk"));
	ts.forEach(System.out::println);
	
}
}
