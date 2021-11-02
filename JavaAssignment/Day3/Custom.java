package com.sonata.assi;


public class Custom {
	
	 	
	public static void main(String args[]) throws MyOwnException{
		int sal=190000;
		if(sal<100000)
			throw new MyOwnException("Salary less than 1 lakh");
			else
				System.out.println("Salary more than 1 lakh");
			}

}
