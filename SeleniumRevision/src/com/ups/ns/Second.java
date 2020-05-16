package com.ups.ns;

public class Second {
	int a=10, b=20, c,d;

	public void add() {
		
		c=a+b;
		System.out.println("the addition of two numbers:" +c);
		
	}
	
	public void subtraction()
	{
		c= a-b;
		
		System.out.println("the subtraction of two numbers :" +c);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		Second se= new Second();
		int c=100;
         se.add();
         se.subtraction();
         Second obj= new Second();
         obj.add();
         obj.subtraction();
         System.out.println(se.d);
         
         
         
         
         
         
         


		
	}
	
	
	
}
