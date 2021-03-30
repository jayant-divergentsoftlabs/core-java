//•	Write a program that reverses the letters of each word and a program that reverses the letters of each word and the words themselves.

package com.divergent.corejava.assignment1;

/**
 * This program will Reverse the words of given string.In this we will use
 * string builder method .reverse().
 * 
 * @author Jayant
 *
 */

public class ReverseWord {
	/**
	 * In this method(i.e. reverseWordMethod),we will reverse the string by the help
	 * of string builder.
	 * 
	 * @param sb
	 */
	private void reverseWordMethod(StringBuilder sb) {

		System.out.println("string = " + sb);
		StringBuilder a = sb.reverse();
		System.out.println("reverse = " + a);
	}

	/**
	 * In this main method we will call the method for print the reverse string.
	 * 
	 * @param ar
	 */
	public static void main(String ar[]) {
		ReverseWord reverseword = new ReverseWord();
		StringBuilder sb = new StringBuilder("Don't give up");
		reverseword.reverseWordMethod(sb);

	}

}
