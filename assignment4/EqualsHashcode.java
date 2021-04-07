package com.divergent.corejava.assignment4;

import java.util.Objects;
/**
 * Class with Hashcode and equals
 * @author Jayant
 *
 */

public class EqualsHashcode {
	public static void main(String[] args) {

		Employee e = new Employee("Jay", "100");
		Employee e1 = new Employee("Jay", "100");
		System.out.println("Equals-: " +e.equals(e1));
		
		int hashValueOfE = e.hashCode();
		int hashValueOfE1 = e1.hashCode();
		System.out.println("Hashcode-: " +(hashValueOfE==hashValueOfE1));
	}

}

class Employee {

	String name;
	String salary;

	public Employee(String string, String i) {
		name = string;
		salary = i;
	}

	@Override
	public boolean equals(Object object) {
		Employee em = (Employee) object;
		 if(!(em instanceof Employee)) {
			return false;
		 }
		else if(null==em)
			return false;
		else if(this.name.equals(em.name)&& this.salary==em.salary)
			return true ;
		else
			return false;
	}
	public int hashCode() {
		return Objects.hash(name,salary);
		
	}
}