package com.sonata.assi;

public class Product {
	int proid;
	String proname;
	double proprice;
	
	Product(int a,String b,double c){
		this.proid=a;
		this.proname=b;
		this.proprice=c;
	}
	
	public double GST(int a) {
		return this.proprice+a;
	}
	
	public void display() {
		System.out.println(proid);
		 System.out.println(proname);
		 
	}
	
public static void main(String args[]) {
	Product p=new Product(001, "Clutches", 2500);
	p.display();
	System.out.println();
	System.out.println("The price of product inclusive GST is "+p.GST(70));
	
}
}
