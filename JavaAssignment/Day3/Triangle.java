package com.sonata.assi;

public class Triangle extends Shape{

	public double triangle(int h,int w) {
		return (h*w)/2;
	}
	
public static void main(String args[]) {
	Triangle t=new Triangle();
	System.out.println("The are of Triangle "+ t.triangle(30, 20));
	}
}
