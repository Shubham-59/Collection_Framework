package com.comparator.otherway;

public class Student {
private int id;
private String name;
private int rollno;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + getName() + ", rollno=" + rollno + "]";
}
public Student(int id, String name, int rollno) {
	super();
	this.id = id;
	this.setName(name);
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
