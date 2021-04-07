package com.divergent.corejava.assignment3;

import java.util.ArrayList;
import java.util.List;
/**
 * Employee class with perameterized constructor and for each loop
 * @author Jayant
 *
 */

class Employee1 {
	String name, dept;
	int id;

	Employee1(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}


public class Employee {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101, "Jems", "Guard"));
		list.add(new Employee1(102, "Anderson", "Staff"));
		list.add(new Employee1(103, "Maxxwel", "Teacher"));

		for (Employee1 emp : list) {
			System.out.println(emp.id + " " + emp.name + " " + emp.dept);
		}
	}
	}
