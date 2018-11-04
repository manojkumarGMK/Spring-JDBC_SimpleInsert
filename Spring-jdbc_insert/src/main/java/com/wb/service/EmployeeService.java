package com.wb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wb.dao.EmployeeDao;
import com.wb.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeedao;
	
	public EmployeeService() {
		System.out.println(" Employee SErvice ...");
	}
	
	public int saveEmp(Employee employee) {
		
		Double salary = employee.getSalary();
		Double taxAmount=(salary*30)/100;
		Double netsalary=salary-taxAmount;
		employee.setSalary(salary);
		
		return employeedao.save(employee);
		
	}
	
}
