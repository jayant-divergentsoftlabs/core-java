package com.divergent.corejava.assignment3;

public class ConstructorChaining {

	public ConstructorChaining() {
		System.out.println("no perameter constructor");
	}
	public ConstructorChaining(int x) {
		this();
		System.out.println(x);
	}
	public ConstructorChaining(int x,int y) {
		this(2);
		
		System.out.println(x*y);
		
	}
	public static void main(String[] args) {
		new ConstructorChaining(2, 3);
	}

}
