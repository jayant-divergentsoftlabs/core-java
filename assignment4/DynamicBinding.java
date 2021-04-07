package com.divergent.corejava.assignment4;
/**
 * Dynamic Binding
 * @author Jayant
 *
 */
public class DynamicBinding {
	public static void main(String[] args) {

		SubClass class1 = new SubClass();
		class1.Method();
	}
}

class SuperClass {
	public void Method() {
		System.out.println("This is Parent Class");

	}
}

class SubClass extends SuperClass {

	@Override
	public void Method() {
		super.Method();
		System.out.println("This is child class");
	}
}
