//•	Write a program that concatenates the same string a given number of times.

package com.divergent.corejava.assignment2;

import java.util.*;

/**
 * This program will concate the same string a given number of time.
 * 
 * @author Jayant
 *
 */
public class ConcateString {
	/**
	 * This method(i.e.concateStringMethod) used to Concate two same string.
	 * 
	 * @param s
	 * @param n
	 */
	private static void concateStringMethod(String s, Integer n) {

		StringBuilder str = new StringBuilder(s);
		for (int i = 1; i < n; i++) {
			System.out.println("New String: " + str.append(s));
		}

	}

	/**
	 * By the help of main class we will get input from user and use it by reference
	 * calling.
	 * 
	 * @param ar
	 */
	public static void main(String ar[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = in.next();
		System.out.println("Enter value for n: ");
		int n = in.nextInt();
		concateStringMethod(s, n);

	}
}
