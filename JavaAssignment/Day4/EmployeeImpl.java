package com.sonata.assi;

import java.util.LinkedList;
import java.util.List;

import com.sonata.CompletEmp.Employee;

import java.util.List;

public class EmployeeImpl extends Employee implements EmployeeInt{
	List<Employee> l1=new LinkedList<>();
		
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		l1.add(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public double yearSalary(Employee e1) {
		// TODO Auto-generated method stub
		return empSal*12;
	}

	@Override
	public double appSalary(Employee e1) {
		// TODO Auto-generated method stub
		if(empSal<10000) 
			return empSal+5000;
		else
		return empSal;
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}