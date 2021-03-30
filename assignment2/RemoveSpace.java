package com.divergent.corejava.assignment2;

/**
 * In this program we will remove spaces from given string
 * 
 * @author Jayant
 *
 */
public class RemoveSpace {
	/**
	 * The method(i.e. removeSpaceMethod) will remove the spaces from the given
	 * string.
	 * 
	 * @param s1
	 */
	private void removespaceMethod(String s1) {
		System.out.println(s1);
		String a = s1.replaceAll(" ", "");
		System.out.println(a);
	}

	/**
	 * In the main method we will give the string and operate by object calling.
	 * 
	 * @param ar
	 */

	public static void main(String ar[]) {
		String s1 = "             .   .                  Jayant          Bhaderiya    ";
		RemoveSpace removespace = new RemoveSpace();
		removespace.removespaceMethod(s1);
	}
}
