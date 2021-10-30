package com.sonata.assi;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	
	Ford(double price){
		super(price);
	}
	
	public double getSalePrice() {
		return regularPrice-manufacturerDiscount;
	}
	
	public static void main(String args[]) {
		Ford f=new Ford(2000);
		f.manufacturerDiscount=100;
		System.out.println(f.getSalePrice());
	}

}
