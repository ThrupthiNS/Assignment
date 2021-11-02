package com.sonata.assi;

public class Staff extends EmployeeA{

		String title;
		
		@Override
		double calculateSalary() {
			double salary;
			double HRA = 0.18*basicPay;
			return salary = basicPay + HRA;
		}

		@Override
		public String toString() {
			return "Staff [empID=" + empID + ", empName=" + empName + "]";
		}
		public static void main(String args[]) {
			Staff s= new Staff();
			s.basicPay=100;
			s.empID=100;
			s.empName="Rachana";
			System.out.println(s.toString());
		System.out.println("The salary for staff is "+s.calculateSalary());
		}
}
