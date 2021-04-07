package com.divergent.corejava.assignment4;
/**
 * This Class uses a method ToString
 * @author Jayant
 *
 */

public class ToString {

		int id;
		String name;
		String city;

		ToString(int id, String name, String city) {
			this.id = id;
			this.name = name;
			this.city = city;
		}

		public String toString() {						// overriding the toString() method
			return id + " " + name + " " + city;
		}

		public static void main(String args[]) {
			ToString e1=new ToString(1, "Veer", "Indore");
			ToString e2=new ToString(2, "Neer", "Ujjain");
			
			System.out.println(e1);
			System.out.println(e2);
			
		}
	}


