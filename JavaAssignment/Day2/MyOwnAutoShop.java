package com.sonata.assi;

public class MyOwnAutoShop extends Sedan {
	
	MyOwnAutoShop(double price){
		super(price);
		System.out.println(price);
	}
	
		
	public static void main(String args[]) {
		MyOwnAutoShop s=new MyOwnAutoShop(1000);
		s.color="red";
		s.length=30;
				
	
}
}
