//•	Write a program that checks whether the given string contains only digits.

package com.divergent.corejava.assignment1;

/**
 * 
 * In this program we will check,there is a digit in the string or not.
 * @author Jayant
 *
 */
class StringContainDigit {
	/**
	 * In this method(i.e. containDigitMethod) we will see that given string
	 * contains digit or not.
	 * 
	 * @param s1
	 */
	private void containDigitMethod(String s1) {
		if (s1.matches("[0-9]+")) {
			System.out.println("It contains only digit");
		} else
			System.out.println("It didn't contains only digit");

	}

	/**
	 * In this main method we will call the method for print that this string
	 * contains digit or not.
	 * 
	 * @param ar
	 */

	public static void main(String ar[]) {
		String s1 = new String("2xmc5");
		StringContainDigit digitcontain = new StringContainDigit();
		digitcontain.containDigitMethod(s1);

	}
}
