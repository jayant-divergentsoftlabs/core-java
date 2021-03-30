package com.divergent.corejava.assignment3;

import java.time.LocalDate;

public class Employee {
	private String name;
	private LocalDate HireDate;
	private Double Salary;

	private Employee() {
		this.name = name;
		this.HireDate = HireDate;
		this.Salary = Salary;

	}

//	public String toString() {
//		return "name " + " HireDate" + "Salary";
//
//	}

	public static Employee getemployee(String name, LocalDate HireDate, Double Salary) {
		return new Employee();

	}

	public static void main(String[] args) {
		Employee employee[] = new Employee[3];
		employee[0] = getemployee("Nayak", LocalDate.of(2010, 11, 11), 123456.11);
		employee[1] = getemployee("Jay", LocalDate.of(2021, 03, 7), 12233.50);
		employee[2] = getemployee("Jayant", LocalDate.of(2021, 03, 26), 124523.89);
	}
	

}
