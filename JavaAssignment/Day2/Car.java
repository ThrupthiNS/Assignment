package com.sonata.assi;

public class Car {

		int speed;
		double regularPrice;
		String color;
		
		Car(double price) {
			this.regularPrice=price;
		}
		public double getSalePrice() {
			
			return regularPrice;
			
		}
		public static void main(String args[]) {
			Car c=new Car(2000);
			System.out.println(c.getSalePrice());
			
		}
		
}
