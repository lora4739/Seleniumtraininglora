package com.ups.ns;

public interface Rbi {

	public void withdrawl();
	public void savings();
	
public static void main(String[] args)
{
	Rbi R;
	
	R=new Icici();
	R.savings();
	R.withdrawl();
}
}
