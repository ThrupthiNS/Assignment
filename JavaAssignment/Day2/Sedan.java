package com.sonata.assi;

public class Sedan extends Car {
	int length;
	
	Sedan(double price){
		super(price);
		
	}
	public double getSalePrice(int length) 
		{
		if(length>20) 
		{
			regularPrice=regularPrice-(regularPrice*5)/100;
						}
		else
			regularPrice=regularPrice-(regularPrice*10)/100;
	
		return regularPrice;
		}
	public static void main(String args[]) {
	Sedan s=new Sedan(200);
		
	System.out.println(s.getSalePrice(10));
	
}


}
