package com.sonata.assi;

public class Student {
	int stdId;
	 String stdName;
	 int stdClass;
	 
	 public void display() {
		 System.out.println(stdId);
		 System.out.println(stdName);
		 System.out.println(stdClass);
	 }
	 
	 public static void main(String args[]) {
		 Student s=new Student();
		 s.stdId=01;
		 s.stdName="Thrupthi";
		 s.stdClass=12;
		 s.display();
	 }
}
