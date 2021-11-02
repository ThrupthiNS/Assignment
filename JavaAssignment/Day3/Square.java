package com.sonata.assi;

public class Square extends Shape {
public double square(int l) {
		
		return l*l;
	}

	public static void main(String args[]) {
		Square s=new Square();
		System.out.println("The are of square "+ s.square(10));
		
	}

}
