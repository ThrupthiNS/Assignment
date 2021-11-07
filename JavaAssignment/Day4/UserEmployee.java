package com.sonata.assi;

public class UserEmployee extends Employee
{
	public static void main(String args[]) {
		Employee e=new Employee();
		e.setEmpId(123);
		e.setEmpName("Thrupthi");
		e.setEmpSal(30000);
		
		
		Employee e1=new Employee();
		e1.setEmpId(124);
		e1.setEmpName("Rachana");
		e1.setEmpSal(300000);
		
		//System.out.println(e);
		//System.out.println(e1);
				
		EmployeeImpl l1=new EmployeeImpl();
		//l1.addEmployee(l1);
		//l1.appSalary(l1);
		l1.setEmpId(123);
		l1.setEmpId(123);
		l1.setEmpSal(100);
		
		//System.out.println(l1.getEmployee());
		//System.out.println(l1);
		System.out.println(l1.yearSalary(l1));
		System.out.println(l1.appSalary(l1));
		System.out.println();
		
		
	}
}
