package com.wb.entity;

public class Employee {

	private Integer EmployeeID;
	private String Name;
	private Double Salary;
	
	public Employee() {
		System.out.println("Employee ....");
	}
	
	public Integer getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		EmployeeID = employeeID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}

	
	
}
