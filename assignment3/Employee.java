package com.divergent.corejava.assignment3;



	import java.time.LocalDate;


	public class Employee {
	private  String[] name= {"joy","roy"};
  private	 LocalDate[] HireDate ;
	private Double[] Salary= {(double) 100000,(double) 20000};
	 
	   private Employee() {
		   this.name=name;
		   this.HireDate=HireDate;
		   this.Salary=Salary;
	    	
	    }
	 public static Employee getemployee(String[] name,LocalDate[] HireDate,Double[] Salary) {
		return new Employee();
		
	
		}
	 
	 public String toString() {
		return "name "+" HireDate" + "Salary";
		 
	 }
	 
		public static void main(String ar[]) {
			Employee emp=new Employee();	
			
			
		}
	
			
		}
         
	


	