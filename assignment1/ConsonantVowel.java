package com.divergent.corejava.assignment1;

/**
 * This program simply find the number of consonant and vowel from a string and
 * will print the number of consonant and vowel.
 * 
 * @author Jayant
 *
 */
public class ConsonantVowel {
	/**
	 * This Method findConsVowel used to find the number of vowel and consonant from
	 * the string.
	 * 
	 * @param s1
	 */

	private void findConsVowel(String s1) {

		int V = 0, C = 0;
		s1 = s1.toUpperCase();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O'
					|| s1.charAt(i) == 'U') {
				V++;
			} else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
				C++;
			}
		}
		System.out.println("Vowels are " + V);
		System.out.println("Consonents are " + C);

	}
	/**
	 * In this main method we will operate method calling by making object.And will
	 * print Number of Consonent and vowel.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ConsonantVowel consVowel = new ConsonantVowel();
		String s1 = "You can & You will";
		consVowel.findConsVowel(s1);
	}

	
}