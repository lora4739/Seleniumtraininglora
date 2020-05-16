package com.ups.ns;

public class Practicecon {
	
	
	int rollno;
	String studentname;
	
	public Practicecon ()
	{
		System.out.println("I am default constructor");
	}
    public Practicecon(int l, String s) {
    	rollno=l;
    	studentname=s;
    }
    
	
	
	
	public static void main(String[] args) {
		Practicecon con= new Practicecon(456,"srihan");
		
		System.out.println(con.rollno);
		System.out.println(con.studentname);
		

	}

}
