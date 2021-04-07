package com.divergent.corejava.assignment2;

/**
 * In this program we will remove character from given string
 * 
 * @author Jayant
 *
 */
public class RemoveCharacter {
	/**
	 * The method(i.e. removeCharacterMethod) will remove the character from the
	 * given string.
	 * 
	 * @param s1
	 */
	private void removeCharacterMethod(String s1) {
		char remove = '@';
		for (int i = 0; i <= s1.length(); i++) {
			System.out.println(s1.replace(remove, ' '));
			break;
		}
	}

	/**
	 * In the main method we will give the string and operate by object calling.
	 * 
	 * @param ar
	 */
	public static void main(String ar[]) {
		String s1 = "my@name@is@....";
		RemoveCharacter remove = new RemoveCharacter();
		remove.removeCharacterMethod(s1);

	}

}
