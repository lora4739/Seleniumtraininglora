package com.ups.ns;

public class ChildClass extends FirstAbstact {


	public static void main(String[] args) 
	{
		
		ChildClass obj= new ChildClass();
		obj.m1();
		obj.m2();
//		System.out.println(obj.b);
	}

	@Override
	public void m2()
	{
		System.out.println("overiddden method from m2");
			//int b=100;
		
	}
  public void m1()
  {
	  System.out.println(" I am m1 overidden in child class");
	  
  }

	
		
		
	}


