package com.sonata.assi;

public class Truck extends Car{
		int weight;
				
		Truck(double price){
			super(price);
			
		}
		public double getSalePrice(int weight) 
			{
			if(weight>2000) 
			{
				regularPrice=regularPrice-(regularPrice*10)/100;
							}
			else
				regularPrice=regularPrice-(regularPrice*20)/100;
		
			return regularPrice;
			}
	public static void main(String args[]) {
		Truck t=new Truck(2000);
				
		System.out.println(t.getSalePrice(400));
		
	}

}
