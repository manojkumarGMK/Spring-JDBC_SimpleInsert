package com.wb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wb.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDao() {
		System.out.println("Employee Dao ... ");
	}
	public int save(Employee employee) {
		String sql="insert into EMPLOYEE_CHECK(EmployeeID,Name,Salary) values(?,?,?)";
		return jdbcTemplate.update(sql, employee.getEmployeeID(),employee.getName(),employee.getSalary());
		
		
		
		
	}
}
