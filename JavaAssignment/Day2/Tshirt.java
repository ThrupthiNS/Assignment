package com.sonata.assi;

public class Tshirt {
	String color;
	String material;
	String design;
	
	
	Tshirt(){
		System.out.println("This Tshirt is small size");
	}
	
	Tshirt(int s,int l)
	{
		System.out.println("This Tshirt is small size");
		System.out.println("This Tshirt is xtra-large size");
	}
	
	Tshirt(int s,int l,int xl)
	{
		System.out.println("This Tshirt is small size");
		System.out.println("This Tshirt is large size");
		System.out.println("This Tshirt is xtra-large size");
	}
	
	public static void main(String args[]) {
		Tshirt t=new Tshirt();
		//Tshirt t1=new Tshirt(30,40);
		
		
	}

}
