//•	Print "\u0022+\u0022" through code and explain the behaviour


package com.divergent.corejava.assignment1;

/**
 * In this program we will see that how we can add unicode.
 * 
 * @author Jayant
 *
 */

public class Unicode {
	/**
	 * In this method will add two unicodes.
	 */
	private void unicodeMethod() {
		char A = '\u0022';
		char B = '\u0022';
		System.out.println(+A + +B);
	}

	/**
	 * In this main class we will call an object's method.
	 * 
	 * @param a
	 */

	public static void main(String a[]) {
		Unicode unicode = new Unicode();
		unicode.unicodeMethod();

	}

}
