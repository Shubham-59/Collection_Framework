package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(100,"ak",90000));
		list.add(new Employee(200,"ek",80000));
		list.add(new Employee(400,"sk",70000));
		list.add(new Employee(300,"omk",60000));
		list.add(new Employee(600,"fk",880000));
		// old way pass object
		Collections.sort(list,new EMPNameCompataor());
		Collections.sort(list,new EMPIdComparator());
		
		
//An anonymous class is a class without a name, created on the spot — 
//usually to provide a one-time implementation of an interface or abstract class.
		Collections.sort(list, new Comparator<Employee>() {
		    @Override
		    public int compare(Employee e1, Employee e2) {
		        return e1.id - e2.id;  //natural sorting ascending order
		    }	
		});
		//Descending 
		Collections.sort(list, new Comparator<Employee>() {
		    @Override
		    public int compare(Employee e1, Employee e2) {
		        if (e1.id > e2.id) {
		            return -1; // put e1 before e2
		        } else if (e1.id < e2.id) {
		            return 1;  // put e2 before e1
		        } else {
		            return 0;  // same ID
		        }
		    }
		});
		//java 8
		Collections.sort(list, (e1, e2) -> e1.id - e2.id);
//or
		list.sort((e1, e2) -> e1.id - e2.id);

		//Descending
		
		Collections.sort(list, (e1, e2) -> e2.id - e1.id);

		
		
		for(Employee e:list) {
			System.out.println(e);
		}
	}

}
