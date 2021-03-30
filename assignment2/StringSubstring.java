//•	Write a program that checks whether the given string contains the given substring.
package com.divergent.corejava.assignment2;

import java.util.*;

/**
 * In this program we will check,given string have substring or not.
 * 
 * @author Jayant
 *
 */
public class StringSubstring {
	/**
	 * The method(i.e. stringsubstringMethod) will check ,string contains substring
	 * or not.
	 * 
	 * @param str1
	 * @param str2
	 */
	private void stringsubstringMethod(String str1, String str2) {
		System.out.println(str1.contains(str2));
	}

	/**
	 * In the main method we will give the string and operate by object calling.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = sc.next();
		System.out.println("Enter the Substring");
		String str2 = sc.next();
		StringSubstring stringsub = new StringSubstring();
		stringsub.stringsubstringMethod(str1, str2);

	}
}