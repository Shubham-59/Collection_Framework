package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(12,"ak"));
		list.add(new Student(10,"shubham"));
		list.add(new Student(20,"dk"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println("sorting "+list);
	}

}
