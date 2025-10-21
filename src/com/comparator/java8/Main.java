package com.comparator.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	List<Student> list= Arrays.asList(
			new Student(12,"Sk",3333),
            new Student(20,"Rohit",3454),
            new Student(1, "Aman",444),
            new Student(2, "Manoj",211)
			
			);
	// Java 8 Comparator — sort by Name
	Comparator<Student>byName= (s1,s2)->s1.getName().compareTo(s2.getName());
	Collections.sort(list,byName);
	System.out.println("\nSort by Name :");
	list.forEach(System.out::println);
	
	//// Java 8 Comparator — sort by Name
	list.sort(Comparator.comparing(Student::getName));
	System.out.println("\nSort by Name :");
	list.forEach(System.out::println);
	
	/// Java 8 Comparator — sort by Marks DESC
	list.sort(Comparator.comparing(Student::getMarks));
	System.out.println("\nSort by Marks DESC :");
    list.forEach(System.out::println);
    
    // TreeSet with Comparator
    TreeSet<Student> set = new TreeSet<>(Comparator.comparing(Student::getName));
    set.addAll(list);
    System.out.println("\nTreeSet (Sorted by Name):");
    set.forEach(System.out::println);
    
    System.out.println("\nSort by Name (Stream + Comparator):");
    // 2. Stream API - Sort by Name
    list.stream()
        .sorted(Comparator.comparing(Student::getName))
        .forEach(System.out::println);

    System.out.println("\nSort by Marks DESC (Stream + Comparator.reversed):");
    // 3. Stream API - Sort by Marks DESC
    list.stream()
        .sorted(Comparator.comparing(Student::getMarks).reversed())
        .forEach(System.out::println);

    System.out.println("\nSort by Name then Marks (Stream + thenComparing):");
    // 4. Multiple sort (name then marks)
    list.stream()
        .sorted(Comparator.comparing(Student::getName)
        .thenComparing(Student::getMarks))
        .forEach(System.out::println);
    
	
}
}
