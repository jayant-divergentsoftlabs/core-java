package com.divergent.corejava.assignment3;

public class PassByValue {
	int a=50;  
	  
	 void change(int a){  
	 a=a+100;
	 }  
	     
	 public static void main(String args[]){  
	   PassByValue op=new PassByValue();  
	  
	   System.out.println("before change "+op.a);  
	   op.change(500);  
	   System.out.println("after change "+op.a);  
	  
	 }

}
