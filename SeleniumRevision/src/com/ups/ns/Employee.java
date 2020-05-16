package com.ups.ns;

public class Employee {
	
	
	int empno;
	String empname;
	
	public Employee()
	{
		System.out.println("I am a default constuctor");
	}

	public Employee(int i, String string)
	{
		empno=i;
		empname=string;
	}
	


	public static void main(String[] args) {
	 Employee ee=new Employee();
	 System.out.println(ee.empname);
	 System.out.println(ee.empno);
    
   Employee e2= new Employee(123,"lora");
   System.out.println(e2.empname);
   System.out.println(e2.empno);
		   
			 
			 
 
			 

	}

}
