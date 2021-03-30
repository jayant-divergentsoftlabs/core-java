package com.divergent.corejava.assignment3;

public class MethodOverloading {

	public static void name() {
		System.out.println("Jayant");
	}
	public static void name(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		name();
		name("jay","patel");
	}
}
