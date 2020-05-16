package com.ups.ns;

public class Icici implements Rbi {



	
	public static void main(String[] args) {
		
		Icici obj=new Icici();
		obj.withdrawl();
		obj.savings();
		
}

	@Override
	public void withdrawl() {
		System.out.println("lora");
		
	}

	@Override
	public void savings() {
		System.out.println("choudhury");
		
	}
}

