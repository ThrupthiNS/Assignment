package com.sonata.assi;

public class TechnicalEmployee extends EmployeeA {

		String tecski;
				

		@Override
		double calculateSalary() {
			double salary;
			double HRA = 0.12*basicPay;
			// TODO Auto-generated method stub
			return  salary = basicPay + HRA;
		}
		
		@Override
		public String toString() {
			return "TechnicalEmployee [empID=" + empID + ", empName=" + empName + "]";
		}

		public static void main(String args[]) {
			TechnicalEmployee t= new TechnicalEmployee();
			t.basicPay=100;
			t.empID=101;
			t.empName="Thrupthi";
			
			System.out.println(t.toString());
		System.out.println("The salary for technical employee is "+t.calculateSalary());
		}
}
