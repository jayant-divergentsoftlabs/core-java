//•	Write a program that determines whether the given string is a palindrome or not.

package com.divergent.corejava.assignment2;

/**
 * in this program we will see,the given string is palindrom or not.
 * 
 * @author Jayant
 *
 */
public class Palindrom {
	/**
	 * The method(i.e. palindromMethod) will check either the string is palindrom or
	 * not.
	 * 
	 * @param s1
	 */
	private void palindromMethod(String s1) {
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println("Reverse is " + rev);
		if (s1.equals(rev)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not a Palindrome");
		}
	}

	/**
	 * In the main method we will give the string and operate by object calling.
	 * 
	 * @param ar
	 */
	public static void main(String ar[]) {
		String s1 = "kanak";
		Palindrom palindrom = new Palindrom();
		palindrom.palindromMethod(s1);

	}
}
