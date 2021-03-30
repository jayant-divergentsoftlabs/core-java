//•	Write a program that print duplicate characters from a given string.

package com.divergent.corejava.assignment1;

/**
 * This Program will print the duplicate characters which are available in the
 * given string.
 * 
 * @author Jayant
 *
 */

public class PrintDuplicateCharacters {
	/**
	 * This method (i.e. DuplicateCharacters) will print the duplicate characters
	 * which are present in the string.
	 * 
	 * @param string1
	 */

	private void DuplicateCharacters(String string1) {
		int a;
		char string[] = string1.toCharArray();
		for (int i = 0; i < string.length; i++) {
			a = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					a++;

					string[j] = '0';
				}

				if (a > 1 && string[i] != '0') {
					System.out.print(string[i]);
					System.out.println(+a);
				}
			}
		}
	}

	/**
	 * In this main method we will call the method for print duplicate characters
	 * which are present in given string.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		PrintDuplicateCharacters printDuplicate = new PrintDuplicateCharacters();
		String string1 = "neverever";
		printDuplicate.DuplicateCharacters(string1);
	}

	
}
	

