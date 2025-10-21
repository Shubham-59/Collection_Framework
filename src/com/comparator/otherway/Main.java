package com.comparator.otherway;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<>();
	al.add(new Student(12,"ak",400));
	al.add(new Student(30,"mk",400));
	al.add(new Student(45,"do",400));
	al.add(new Student(80,"r",400));
	al.add(new Student(56,"k",400));
	
	//JAVA 8
	
	
//	Collections.sort(al,(s1,s2)->s1.getName().compareTo(s2.getName()));
	Comparator<Student> byName=(s1,s2) -> s1.getName().compareTo(s2.getName()); 
	Collections.sort(al,byName);
//	Collections.sort(al, Comparator.comparing(Student::getName));
	al.forEach(st->System.out.println(st));
}

}
