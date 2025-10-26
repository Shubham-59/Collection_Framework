package com.set.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args) {
	 Set<Integer> hs=new HashSet<>();
	 hs.add(10);
	 hs.add(90);
	 hs.add(40);
	 hs.add(30);
	 hs.add(10);
	 hs.add(null);
	 hs.add(null);//double null value isn't allow 
	 System.out.println(hs.isEmpty());
	 System.out.println(hs.contains(30));
	 hs.forEach(l->System.out.println(l));
	 System.out.println(hs.size());
	 System.out.println(hs.remove(10));
	System.out.println(hs);	 
}
}
