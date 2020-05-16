package com.ups.ns;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
	  
		Hdfc hh=new Hdfc();
		hh.savings();
		hh.withdrawl();

	}

	@Override
	public void withdrawl() {
		
		System.out.println("Om namah shivya");
		
	}

	@Override
	public void savings() {
		
		System.out.println("om ganeshaya namaha");
		
		
	}

}
