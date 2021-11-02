package com.sonata.assi;

public class Shape {
	int length; 
	int height;
	int width;
	
	public double square(int l) {
		
		return l*l;
	}
	
	public double rectangle(int l,int w) {
		return l*w;
	}
	
	public double triangle(int h,int w) {
		return (h*w)/2;
	}
	
	

}
