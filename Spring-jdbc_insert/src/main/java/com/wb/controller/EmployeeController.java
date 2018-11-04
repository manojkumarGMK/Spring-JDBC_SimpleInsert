package com.wb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import com.wb.entity.Employee;
import com.wb.service.EmployeeService;

@Controller
@ComponentScan(basePackages="com.eitacies")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println(" Employee COntroller ....");
	}
	
	public int save(Employee employee) {
		
		return empService.saveEmp(employee);
	}
}
