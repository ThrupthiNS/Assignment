package com.sonata.assi;

import java.util.List;

import com.sonata.CompletEmp.Employee;

public interface EmployeeInt {
	
		public void addEmployee(Employee e);
		public void deleteEmployee(Employee e);
		public double yearSalary(Employee e1);
		public double appSalary(Employee e1);

		public List<Employee>getEmployee();
}
