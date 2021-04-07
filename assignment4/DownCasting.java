package com.divergent.corejava.assignment4;
/**
 * In this class we perform downcasting by the help of Employee1 and Manager class
 * @author Jayant
 *
 */
public class DownCasting {
	public static void main(String[] args) {
		Employee1 e=new Manager();
		e.Eid=101;
		Manager m=(Manager)e; //Downcasting
		m.name="Jayant";
		System.out.println(m.Eid);
		System.out.println(m.name);
		m.showMsg();
	}
  
	
	

}
 class Employee1{
	int Eid;
	void showMsg() {
	System.out.println("Employee Class");
}
}

class Manager extends Employee1{
	String name;
	@Override
	void showMsg() {
		System.out.println("Manager class");
		
	}
	
}