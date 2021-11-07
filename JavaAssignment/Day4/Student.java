package com.sonata.assi;

import java.util.ArrayList;
import java.util.List;
class Student {
   String name; 
   int marks; 
   int id; 
   public String getName() {
      return name; 
   } 
   public int getMarks() { 
      return marks; 
   } 
   public int getId() { 
      return id; 
   } 
   Student(String n, int a, int i){ 
	      name = n; 
	      marks = a; 
	      id = i; 
	   }  
   @Override 
   public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+ " Marks: "+ this.getMarks() + " Id: "+ this.getId()+"]"); 
   }
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Thrupthi", 22, 1001)); 
      studentlist.add(new Student("Rachana", 19, 1003)); 
      studentlist.add(new Student("Shrenik", 23, 1005)); 
      
      studentlist.sort((Student s1, Student s2)->s2.getMarks()-s1.getMarks()); 
      studentlist.forEach((s)->System.out.println(s)); 
      
   }
}
