package com.sonata.assi;

public class Rectangle extends Shape{

	public double rectangle(int l,int w) {
		return l*w;
	}
	
public static void main(String args[]) {
	Rectangle r=new Rectangle();
	System.out.println("The are of Rectangle "+ r.rectangle(20, 10));
	}
}
